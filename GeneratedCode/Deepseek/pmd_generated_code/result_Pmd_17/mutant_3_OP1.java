import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    public int showBug() {
        // BUG: AvoidMultipleUnaryOperators
        int i = - -1;
        String dummyVariable = "abcdefgh"; //Mutation Operator: Dead Store
        return i;
    }
}