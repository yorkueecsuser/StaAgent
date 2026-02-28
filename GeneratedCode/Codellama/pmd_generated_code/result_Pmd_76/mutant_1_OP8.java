import java.util.*;

class SuspiciousOctalEscape {
    public static void main(String[] args) {
        System.out.println("\038"); // BUG: SuspiciousOctalEscape
        System.out.println("Hello, World!");
    }
}

class RenamedSuspiciousOctalEscape {
    public static void main(String[] args) {
        System.out.println("\038"); // BUG: RenamedSuspiciousOctalEscape
        System.out.println("Hello, World!");
    }
}