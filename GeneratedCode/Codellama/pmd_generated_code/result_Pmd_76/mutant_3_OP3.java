import java.util.*;

class SuspiciousOctalEscape {
    public static void main(String[] args) {
        System.out.println("\038"); // BUG: SuspiciousOctalEscape
        if (false) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This is the only reachable branch");
        }
    }
}