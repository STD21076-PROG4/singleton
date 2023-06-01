package com.singleton.prog;

public class ClassSingletonTest {
    public static void main(String[] args) {
        ClassSingleton singleton1 = ClassSingleton.getInstance();
        singleton1.setDescription("Première instance");

        ClassSingleton singleton2 = ClassSingleton.getInstance();
        System.out.println(singleton2.getDescription());

        singleton2.setDescription("Deuxième instance");
        System.out.println(singleton1.getDescription());
    }
}
