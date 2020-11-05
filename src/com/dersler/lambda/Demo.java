package com.dersler.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * created by: ufuk on 24.10.2020 17:44
 */
public class Demo {
    public static void main(String[] args) {
        Employee employee1 = new Employee("name1", 49);
        Employee employee2 = new Employee("name2", 19);
        Employee employee3 = new Employee("name3", 39);
        Employee employee4 = new Employee("name4", 29);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);


        /**
         *  3 types of usage with the collections' sort method
         */

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        Collections.sort(employees, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        Collections.sort(employees, Comparator.comparing(Employee::getName));

        /**
         * let's use a functional interface of our own
         * there are 2 types of usage for our functional interface
         */
        String myString = doStuff(new StringConcat() {
            @Override
            public String concat(String a, String b) {
                return a + b;
            }
        }, "a", "b");

        myString = doStuff((a, b) -> a + b, "a", "b");

        /**
         *
         */
        StringConcat sc = (a, b) -> {
            String result = a + b;
            return result;
        };
        //System.out.println(sc.concat("a", "b"));

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSth();
        System.out.println(s);

    }

    static String doStuff(StringConcat concat, String a, String b) {
        return a + b;
    }

}

interface StringConcat {
    String concat(String a, String b);
}

class AnotherClass {
    public String doSth() {
        System.out.println("AnotherClass : " + getClass().getSimpleName());
        return Demo.doStuff(new StringConcat() {
            @Override
            public String concat(String a, String b) {
                System.out.println("anonymous class : " + getClass().getName());
                return a + b;
            }
        }, "a", "b");

    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}