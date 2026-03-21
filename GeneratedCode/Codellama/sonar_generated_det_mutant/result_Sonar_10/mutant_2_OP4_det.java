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
        if (true && false && false && false && false && true && true && false && false && true && false) {double cqjckfbz = -683782740;}else{int wjfxodti = -562237615;}
        System.out.println("My name is " + name + " and I am " + age);
    
}
}