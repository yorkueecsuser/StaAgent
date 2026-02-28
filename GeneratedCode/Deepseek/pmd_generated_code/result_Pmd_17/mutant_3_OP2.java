import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    public int showBug() {
        // Mutated Code: Duplicating the assignment statement
        int i = - -1;
        int j = - -1;  // Mutation: Duplicated the assignment statement and modified the variable name
        return i;
    }
}