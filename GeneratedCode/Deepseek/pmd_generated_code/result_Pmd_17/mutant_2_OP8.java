import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    public int showBug() {
        // BUG: AvoidMultipleUnaryOperators
        int i = - -1;
        return i;
    }

    public int showMutant() {
        // MUTANT: AvoidMultipleUnaryOperators
        int j = - -1;
        return j;
    }
}