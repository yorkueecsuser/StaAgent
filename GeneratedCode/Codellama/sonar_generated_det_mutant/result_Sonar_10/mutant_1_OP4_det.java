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
        if (false && false && true && false && true && false && true && true && true && false && false) {char imkxhysh = 'o';}else{byte pvknlyci = 123;}
        System.out.println("My name is " + name + " and I am " + age);
    
}
}