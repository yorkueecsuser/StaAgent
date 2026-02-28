import java.util.Arrays;

class AvoidMultipleUnaryOperators {

    public int showBug() {
        // BUG: AvoidMultipleUnaryOperators
        int i = - -1;
        String deadStore = "abcd1234";
        return i;
    }
}