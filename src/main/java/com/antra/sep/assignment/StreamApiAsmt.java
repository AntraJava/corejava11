package com.antra.sep.assignment;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiAsmt {
    // init a Person list with random data
    static List<Person> pList = new ArrayList<>();
    static {
        pList.add(new Person(24, "John1"));pList.add(new Person(31, "Mary2"));pList.add(new Person(42, "Peter3"));pList.add(new Person(54, "Paul4"));
        pList.add(new Person(21, "James5"));pList.add(new Person(33, "Jane6"));pList.add(new Person(45, "Mary7"));pList.add(new Person(56, "Paul8"));
        pList.add(new Person(23, "James9"));pList.add(new Person(34, "Jane10"));pList.add(new Person(46, "Mary11"));pList.add(new Person(58, "Paul12"));
        pList.add(new Person(25, "James13"));pList.add(new Person(36, "Jane14"));pList.add(new Person(48, "Mary15"));pList.add(new Person(60, "Paul16"));
        pList.add(new Person(27, "James17"));pList.add(new Person(38, "Jane18"));pList.add(new Person(50, "Mary19"));
    }
    // Don't change this method.
    public static void main(String[] args) {

        List<Person> youngPersonList = getYoung(pList, 40);
        System.out.println("1. Young : " + youngPersonList);

        List<Person> namePersonList = getPersonNameStartWith("J",pList);
        System.out.println("2. Get Person Name starts with J : " + namePersonList);

        List<String> personNameList = getPersonName(pList);
        System.out.println("3. All names :" + personNameList);

        Long ageSum = getAgeSum(pList);
        System.out.println("4. Age Sum : " + ageSum);

        List<Person>  sortByAge = sortPersonByAge(pList);
        System.out.println("5. Sorted By Age : " + sortByAge);

        List<Person> newList = removePersonOlderThan(50, pList);
        System.out.println("6. Remove Person older than 50 : " + newList);

        int maxAge = getMaxAge(pList);
        System.out.println("7. Max Age : " + maxAge);

        List<String> nameList = getPersonNameAgeBetween(20, 30, pList);
        System.out.println("8. Get Person Age between 20 and 30 : " + nameList);

        // Key is the first character of the name, value is the list of person with the same first character.
        // like  A->[Annie, Austin], B->[Bob], C->[Clair, Charlie]
        Map<Character, List<Person>> pMap = groupPersonByFirstCharacter(pList);
        System.out.println("9. Get Person Map : " + pMap);

        // find the largest number from the 'list of list of int' below
        List<List<Integer>> listOfListOfInteger = List.of(List.of(10,9,8), List.of(11, 22, 33), List.of(44, 56, 67), List.of(41, 52, 63));
        System.out.println("10. Get List of List of Integer : " + findLargestInteger(listOfListOfInteger));
    }
    ///////////////////////////////////////////////
    // Write your code in below methods.///////////
    // 1 line of code is enough for each method.///
    ///////////////////////////////////////////////

    //Question #1
    private static List<Person> getYoung(List<Person> pList, int ageLimit) {
        return null;
    }
    //Question #2
    private static List<Person> getPersonNameStartWith(String startWith, List<Person> pList) {
        return null;
    }
    //Question #3
    private static List<String> getPersonName(List<Person> pList) {
        return null;
    }
    //Question #4
    private static Long getAgeSum(List<Person> pList) {
        return null;
    }
    //Question #5
    private static List<Person> sortPersonByAge(List<Person> pList) {
        return null;
    }
    //Question #6
    private static List<Person> removePersonOlderThan(int ageLimit, List<Person> pList) {
        return null;
    }
    //Question #7
    private static int getMaxAge(List<Person> pList) {
        return -1;
    }
    //Question #8
    private static List<String> getPersonNameAgeBetween(int from, int to, List<Person> pList) {
        return null;
    }
    //Question #9
    private static Map<Character, List<Person>> groupPersonByFirstCharacter(List<Person> pList) {
        return null;
    }
    //Question #10
    private static Integer findLargestInteger(List<List<Integer>> listOfListOfInteger) {
        return null;
    }
}

class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}