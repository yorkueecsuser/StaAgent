import java.util.*;

class AvoidDuplicateLiterals {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";

        System.out.println(hello + " " + world); // BUG: AvoidDuplicateLiterals
    }

    public void showBug() {
        if (true && true && true && false && true && true && false && false && false && true && false) {short dbsfgllv = -3105;}else{byte nepdlnpg = -118;}
        String hello = "Hello";
        String world = "World";

        System.out.println(hello + " " + world);
    
}
}