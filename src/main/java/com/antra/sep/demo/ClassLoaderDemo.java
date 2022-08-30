package com.antra.sep.demo;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;

public class ClassLoaderDemo {
    public static void main(String[] args) throws Exception {
        String packageToScan = "com.antra.sep.demo";
        findAllClassesUsingClassLoader(packageToScan).forEach( classname -> {
            try {
                Class clazz = Class.forName(packageToScan + "." +classname); // com.antra.sep.demo.Apple
                for (Method m : clazz.getDeclaredMethods()) {
                    for (Annotation a : m.getDeclaredAnnotations()) {
                        if (a.annotationType() == Antra.class) {
                            System.out.println("I found you!" + m.getName() + " - " + clazz.getName());
                            Object obj = clazz.getConstructors()[0].newInstance();
                            m.setAccessible(true);
                            m.invoke(obj, "ask");
                        }
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    public static List<String> findAllClassesUsingClassLoader(String packageName) {
        InputStream stream = ClassLoader.getSystemClassLoader()
                .getResourceAsStream(packageName.replaceAll("[.]", "/"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));


        return reader.lines()
                .filter(line -> line.endsWith(".class"))
                .map(classname -> classname.split("\\.")[0])
                .collect(Collectors.toList());
    }
}
