import java.util.*;

class AvoidDuplicateLiterals {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";

        System.out.println(hello + " " + world); // BUG: AvoidDuplicateLiterals
    }

    public void showBug() {
        String hello = "Hello";
        if (false && false && false && false && false && false && true && false && false && false && false) {short xgxbnmmp = 5055;}
        String world = "World";

        System.out.println(hello + " " + world);
    
}
}