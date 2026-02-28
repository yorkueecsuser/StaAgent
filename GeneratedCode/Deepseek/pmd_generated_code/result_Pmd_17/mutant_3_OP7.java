import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    public int showBug() {
        // BUG: AvoidMultipleUnaryOperators
        int i = - -1;
        return i;
    }

    // Mutated code that avoids unreachable while loop
    public void mutatedCode() {
        boolean condition = false;
        while (condition) {
            // code inside the loop
            System.out.println("This code will never be executed");
        }
    }
}