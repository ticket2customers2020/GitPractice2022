package com.git.demo;

public class Main {
    public static void main(String[] args) {
        System.out.println("demo for adding in git");

        demo();
    }

    private static void demo() {
        System.out.println("Add");
        int a =3,b =4;
        add(a,b);
    }

    private static void add(int a, int b) {
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println("//change List is nothing but stash - have added multiple changelist like DS JAVA8 Java 11");
    }
}
