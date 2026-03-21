import java.util.*;

class AvoidDuplicateLiterals {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";

        System.out.println(hello + " " + world); // BUG: AvoidDuplicateLiterals
    }

    public void showBug() {
        boolean bnndofdu = false;while (bnndofdu && true && false && true && true && true && false && true && true && false && false && false) {byte ovfydygt = 3;}
        String hello = "Hello";
        String world = "World";

        System.out.println(hello + " " + world);
    
}
}