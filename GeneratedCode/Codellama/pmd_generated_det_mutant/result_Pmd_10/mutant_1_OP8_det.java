import java.util.*;

class AvoidDuplicateLiterals {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";

        System.out.println(hello + " " + world); // BUG: AvoidDuplicateLiterals
    }

    public void showBug() {
        String zsrevrtf = "Hello";
        String blyibfgi = "World";

        System.out.println(zsrevrtf + " " + blyibfgi);
    }
}