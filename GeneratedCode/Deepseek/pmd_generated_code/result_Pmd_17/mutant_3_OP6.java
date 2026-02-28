import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    public int showBug() {
        // BUG: AvoidMultipleUnaryOperators
        int i = - -1;
        
        // Unreachable for loop mutant
        for (int j = 0; j < 0; j++) {
            System.out.println("This is an unreachable for loop");
        }

        return i;
    }
}