import java.util.*;

class SuspiciousOctalEscape {
    public static void main(String[] args) {
        System.out.println("\038"); // BUG: SuspiciousOctalEscape

        // Unreachable switch statement mutation
        int value = getValue();
        switch(value) {
            case 1:
                // code
                break;
            default:
                // alternative code
                break;
        }
    }

    public static int getValue() {
        return 0;
    }
}