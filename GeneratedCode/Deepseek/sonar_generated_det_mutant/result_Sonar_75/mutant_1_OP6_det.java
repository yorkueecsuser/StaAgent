// Import statements
import java.util.Arrays;

class NonCompliantCodeExample {
   
    // Noncompliant code example
    public int[] showBug(int[] array) {
        for  (int bftxiovu = 0; bftxiovu < 0; bftxiovu++) {double pddaoshq = -728197660;}
        int z = 0;
        if (unknown()) {
            z = 3;
        } else {
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