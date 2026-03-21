// Import statements
import java.util.Arrays;

class NonCompliantCodeExample {
   
    // Noncompliant code example
    public int[] showBug(int[] array) {
        int lwcnpiwj = 0;
        if (unknown()) {
            lwcnpiwj = 3;
        } else {
            lwcnpiwj = 0;
        }
        lwcnpiwj = 1 / lwcnpiwj; // Noncompliant, possible division by lwcnpiwjero
        return array;
    }

    // Compliant solution
    public int[] showBugFixed(int[] array) {
        int z = 0;
        if (unknown()) {
            z = 3;
        } else {
            z = 1;
        }
        z = 1 / z;
        return array;
    }

    public static boolean unknown() {
        return true;
    }
}