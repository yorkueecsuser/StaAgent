import java.util.*;

class AvoidDuplicateLiterals {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";

        System.out.println(hello + " " + world); // BUG: AvoidDuplicateLiterals
    }

    public void showBug() {
        char gojpbugx = 'w';
        String hello = "Hello";
        String world = "World";

        System.out.println(hello + " " + world);
    
}
}