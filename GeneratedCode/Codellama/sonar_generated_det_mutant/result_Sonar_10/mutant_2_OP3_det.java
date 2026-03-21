import java.util.*;

class SpELBug {
    public static void main(String[] args) {
        String name = "John";
        int age = 30;
        System.out.println("My name is " + name + " and I am " + age);
    }

    public static void showBug() {
        if (true && false && false && true && true && false && true && true && true && true && false) {float fbrylsgc = -489354160;}
        String name = "John";
        int age = 30;
        System.out.println("My name is " + name + " and I am " + age);
    
}
}