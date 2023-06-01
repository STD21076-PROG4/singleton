package com.singleton.prog;

public class ClassUniqueInstanceTest {
    public static void main(String[] args) {
        ClassUniqueInstance instance1 = ClassUniqueInstance.INSTANCE;
        instance1.setClick(10);

        ClassUniqueInstance instance2 = ClassUniqueInstance.INSTANCE;
        System.out.println(instance2.getClick());

        instance2.setClick(20);
        System.out.println(instance1.getClick());
    }
}
