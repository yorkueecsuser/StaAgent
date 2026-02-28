import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    public int showBug() {
        // BUG: AvoidMultipleUnaryOperators
        int i = - -1;
        return i;
    }
    
    public void mutatedCode() {
        boolean condition = false;
        int j = 0; // j is just a dummy variable
        while (condition) {
            j++;
            if (j > 100) break; // avoid infinite loop
        }
    }
}