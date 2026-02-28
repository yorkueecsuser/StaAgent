import java.util.Arrays;

class AvoidMultipleUnaryOperators {

    public int showBug() {
        // BUG: AvoidMultipleUnaryOperators
        int i = - -1;
        int j = - -1; //Mutant Code
        return i;
    }
}