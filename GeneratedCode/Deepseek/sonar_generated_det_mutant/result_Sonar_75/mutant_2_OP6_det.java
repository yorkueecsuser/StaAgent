// Import statements
import java.util.Arrays;

class NonCompliantCodeExample {
   
    // Noncompliant code example
    public int[] showBug(int[] array) {
        int z = 0;
        if (unknown()) {
            z = 3;
        } else {
            for  (int qovalhkz = 0; qovalhkz < 0; qovalhkz++) {double ccwwiqpp = 4290326;}
            z = 0;
        }
        z = 1 / z; // Noncompliant, possible division by zero
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