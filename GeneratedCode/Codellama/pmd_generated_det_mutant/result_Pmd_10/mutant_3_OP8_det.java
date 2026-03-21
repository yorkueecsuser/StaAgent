import java.util.*;

class AvoidDuplicateLiterals {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";

        System.out.println(hello + " " + world); // BUG: AvoidDuplicateLiterals
    }

    public void showBug() {
        String zycaccxe = "Hello";
        String ulsqfsvq = "World";

        System.out.println(zycaccxe + " " + ulsqfsvq);
    }
}