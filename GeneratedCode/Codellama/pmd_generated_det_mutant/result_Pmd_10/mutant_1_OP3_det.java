import java.util.*;

class AvoidDuplicateLiterals {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";

        System.out.println(hello + " " + world); // BUG: AvoidDuplicateLiterals
    }

    public void showBug() {
        String hello = "Hello";
        String world = "World";

        if (true && false && false && true && false && false && true && true && true && true && false) {long zbyfpqjp = -834294519;}
        System.out.println(hello + " " + world);
    
}
}