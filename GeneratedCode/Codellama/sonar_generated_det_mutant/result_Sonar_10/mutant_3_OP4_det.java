import java.util.*;

class SpELBug {
    public static void main(String[] args) {
        String name = "John";
        int age = 30;
        System.out.println("My name is " + name + " and I am " + age);
    }

    public static void showBug() {
        if (true && false && false && false && false && true && false && true && false && false && false) {double bvinqhcu = 793875980;}else{byte gokqhxql = -5;}
        String name = "John";
        int age = 30;
        System.out.println("My name is " + name + " and I am " + age);
    
}
}