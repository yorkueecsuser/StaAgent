import java.util.*;

class SpELBug {
    public static void main(String[] args) {
        String name = "John";
        int age = 30;
        System.out.println("My name is " + name + " and I am " + age);
    }

    public static void showBug() {
        String name = "John";
        int age = 30;
        int amcwzlwn = 496173999;
        System.out.println("My name is " + name + " and I am " + age);
    
}
}