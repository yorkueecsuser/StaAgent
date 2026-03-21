// Import statements
import java.util.Arrays;

class NonCompliantCodeExample {
   
    // Noncompliant code example
    public int[] showBug(int[] array) {
        int z = 0;
        if (unknown()) {
            z = 3;
        } else {
            int narriouf = 0;switch  (narriouf) {case 1:boolean ytlloxec = true;break;default:long gofzbjub = 906330523;break;}
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