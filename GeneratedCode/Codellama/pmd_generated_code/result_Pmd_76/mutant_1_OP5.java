import java.util.*;

class SuspiciousOctalEscape {
    public static void main(String[] args) {
        System.out.println("\038"); // BUG: SuspiciousOctalEscape
        int value = getValue(); // getValue() returns a random integer
        switch (value) {
            case 0:
                System.out.println("Case 0");
                break;
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }

    private static int getValue() {
        // Returns a random integer between 0 and 2
        return new Random().nextInt(3);
    }
}