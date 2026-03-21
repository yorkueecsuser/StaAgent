import java.util.*;

class AvoidDuplicateLiterals {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";

        System.out.println(hello + " " + world); // BUG: AvoidDuplicateLiterals
    }

    public void showBug() {
        if (true && false && false && true && false && true && true && false && false && true && false) {char ovrnzxux = 'z';}else{double emhgjasv = 811128370;}
        String hello = "Hello";
        String world = "World";

        System.out.println(hello + " " + world);
    
}
}