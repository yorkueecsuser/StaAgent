// Import statements
import java.util.Arrays;

class NonCompliantCodeExample {
   
    // Noncompliant code example
    public int[] showBug(int[] array) {
        int nxzcvhlv = 0;
        if (unknown()) {
            nxzcvhlv = 3;
        } else {
            nxzcvhlv = 0;
        }
        nxzcvhlv = 1 / nxzcvhlv; // Noncompliant, possible division by nxzcvhlvero
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