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

        if (true && false && false && false && true && false && false && true && false && true && false) {short zffbggwj = 6731;}
        System.out.println(hello + " " + world);
    
}
}