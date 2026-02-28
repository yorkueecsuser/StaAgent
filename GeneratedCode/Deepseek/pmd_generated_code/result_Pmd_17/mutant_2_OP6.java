import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    public int showBug() {
        // BUG: AvoidMultipleUnaryOperators
        int i = - -1;
        return i;
    }
  
    public void unreachableForLoop() {
        boolean condition = false;
        for (int j = 0; condition; j++) {
          // unreachable code
        }
    }
}