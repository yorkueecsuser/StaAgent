import java.util.*;

class AvoidDuplicateLiterals {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";

        System.out.println(hello + " " + world); // BUG: AvoidDuplicateLiterals
    }

    public void showBug() {
        String hello = "Hello";
        if (false && true && true && false && true && false && false && false && true && true && false) {float klqepiwn = -270518105;}else{double crbjjltj = -963749602;}
        String world = "World";

        System.out.println(hello + " " + world);
    
}
}