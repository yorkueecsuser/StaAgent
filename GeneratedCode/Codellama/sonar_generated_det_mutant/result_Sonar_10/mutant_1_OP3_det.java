import java.util.*;

class SpELBug {
    public static void main(String[] args) {
        String name = "John";
        int age = 30;
        System.out.println("My name is " + name + " and I am " + age);
    }

    public static void showBug() {
        String name = "John";
        if (false && false && true && false && true && true && true && false && true && false && false) {float xxuyiube = -719621218;}
        int age = 30;
        System.out.println("My name is " + name + " and I am " + age);
    
}
}