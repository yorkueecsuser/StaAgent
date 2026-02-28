import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    public int showBug() {
        // BUG: AvoidMultipleUnaryOperators
        int i = - -1;

        // Mutation: Insert unreachable while loop
        while (false) {
            // Unreachable code
            String unreachable = "This code will never be executed";
        }

        return i;
    }
}