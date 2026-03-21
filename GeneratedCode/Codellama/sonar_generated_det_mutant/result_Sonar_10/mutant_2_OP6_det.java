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
        for  (int vfsyydxg = 0; vfsyydxg < 0; vfsyydxg++) {long ckqeaair = -594129512;}
        System.out.println("My name is " + name + " and I am " + age);
    
}
}