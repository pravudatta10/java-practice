package com.pravudatta.javapractice.collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionPracticeOct17 {
    //Find duplicate elements in a List Input: [1, 2, 3, 2, 4, 1] HashSet
    static void question1() {
        List<Integer> list = List.of(1, 2, 3, 2, 4, 1);
        HashSet<Integer> seen = new HashSet<>();
        LinkedHashSet<Integer> duplicate = new LinkedHashSet<>();
        for (Integer num : list) {
            if (!seen.add(num)) {
                duplicate.add(num);
            }
        }
        System.out.println(duplicate);
    }

    //Count the frequency of each element HashMap / Streams Input: [1, 2, 2, 3, 1, 1]
    static void question2() {
        List<Integer> list = List.of(1, 2, 2, 3, 1, 1);
        HashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        for (Integer num : list) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(hashMap);

        //using stream
        Map<Integer, Long> collect = list.stream()
                .collect(Collectors.groupingBy(Function.identity()
                        , LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);
    }

    //Remove duplicates while preserving insertion order LinkedHashSet Input: [3, 1, 3, 2, 1]
    static void question3() {
        List<Integer> list = List.of(3, 1, 3, 2, 1);
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (Integer num : list) {
            linkedHashSet.add(num);
        }
        System.out.println(linkedHashSet);
    }

    //Find the first non-repeated character in a String. LinkedHashMap Input: "swiss" Output: 'w'
    static void question4() {
        String str = "swiss";
        char[] charArray = str.toCharArray();
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character ch : charArray) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return;
            }
        }
    }

    //Find the first repeated character in a String HashSet , Input: "programming" , Output: 'r'
    static void question5() {
        String str = "programming";
        char[] charArray = str.toCharArray();
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character ch : charArray) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                System.out.println(entry.getKey());
                return;
            }
        }
    }

    //Sort a Map by its values , Map.Entry / Streams , Input: {A=30, B=10, C=20} , Output: {B=10, C=20, A=30}
    static void question6() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 30);
        map.put("B", 10);
        map.put("C", 20);
        Map<String, Integer> res = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
        System.out.println(res);
    }

    //Sort a List of employees by salary , Comparator , Sort Employee objects by salary ascending; break ties by name.
    static void question7() {
        List<Employee> employeesList = new ArrayList<>(List.of(
                new Employee(1, "Pravudatta", 12000.00),
                new Employee(1, "Chandan", 12000.00),
                new Employee(2, "Happy", 20000.00),
                new Employee(3, "Sipu", 30000.00)
        ));
//        List<Employee> list = employeesList.stream().sorted((a, b) -> Double.compare(a.salary(), b.salary())).toList();
//        System.out.println(list);
        employeesList.sort(Comparator.comparingDouble(Employee::salary).thenComparing(Employee::name));
        employeesList.forEach(System.out::println);
    }

    record Employee(Integer id, String name, Double salary) {
    }

    //Find common elements between two Lists , HashSet, Input: [1, 2, 3] and [2, 3, 4], Output: [2, 3]
    static void question8() {
        List<Integer> list = List.of(1, 2, 3);
        List<Integer> list1 = List.of(2, 3, 4);
        HashSet<Integer> integers = new HashSet<>(list1);
        LinkedHashSet<Integer> common = new LinkedHashSet<>();
        for (Integer num : list) {
            if (integers.contains(num)) {
                common.add(num);
            }
        }
        System.out.println(common);
    }

    public static void main(String[] args) {
        question8();
    }
}
