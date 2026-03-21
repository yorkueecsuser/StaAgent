// Import statements
import java.util.Arrays;

class NonCompliantCodeExample {
   
    // Noncompliant code example
    public int[] showBug(int[] array) {
        int iiraqmtf = 0;
        if (unknown()) {
            iiraqmtf = 3;
        } else {
            iiraqmtf = 0;
        }
        iiraqmtf = 1 / iiraqmtf; // Noncompliant, possible division by iiraqmtfero
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