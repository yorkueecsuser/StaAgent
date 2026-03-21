import java.util.*;

class SpELBug {
    public static void main(String[] args) {
        String name = "John";
        int age = 30;
        System.out.println("My name is " + name + " and I am " + age);
    }

    public static void showBug() {
        String name = "John";
        for  (int kjkprxyg = 0; kjkprxyg < 0; kjkprxyg++) {short ilpsexjm = -3217;}
        int age = 30;
        System.out.println("My name is " + name + " and I am " + age);
    
}
}