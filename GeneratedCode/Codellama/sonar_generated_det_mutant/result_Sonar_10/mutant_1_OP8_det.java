import java.util.*;

class SpELBug {
    public static void main(String[] args) {
        String name = "John";
        int age = 30;
        System.out.println("My name is " + name + " and I am " + age);
    }

    public static void showBug() {
        String hbxxxefi = "John";
        int vdyoefob = 30;
        System.out.println("My hbxxxefi is " + hbxxxefi + " and I am " + vdyoefob);
    }
}