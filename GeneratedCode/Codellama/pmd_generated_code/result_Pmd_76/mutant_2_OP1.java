import java.util.*;

class SuspiciousOctalEscape {
    public static void main(String[] args) {
        int xyzabc = 0; // Dead Store Mutation Operator
        System.out.println("\038"); // BUG: SuspiciousOctalEscape
    }
}