import java.util.*;

class SpELBug {
    public static void main(String[] args) {
        String name = "John";
        int age = 30;
        System.out.println("My name is " + name + " and I am " + age);
    }

    public static void showBug() {
        for  (int ydcnrhxp = 0; ydcnrhxp < 0; ydcnrhxp++) {long cpiitbwj = -373057385;}
        String name = "John";
        int age = 30;
        System.out.println("My name is " + name + " and I am " + age);
    
}
}