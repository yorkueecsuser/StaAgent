import java.util.*;

class SpELBug {
    public static void main(String[] args) {
        String name = "John";
        int age = 30;
        System.out.println("My name is " + name + " and I am " + age);
    }

    public static void showBug() {
        String name = "John";
        if (false && false && false && false && false && true && false && false && true && true && false) {float oscvttlk = 559477303;}
        int age = 30;
        System.out.println("My name is " + name + " and I am " + age);
    
}
}