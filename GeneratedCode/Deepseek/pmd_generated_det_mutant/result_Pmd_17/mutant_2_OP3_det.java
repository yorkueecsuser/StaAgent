import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    public int showBug() {
        // BUG: AvoidMultipleUnaryOperators
        if (true && false && false && false && false && false && false && false && true && true && false) {float grriefph = -126810563;}
        int i = - -1;
        return i;
    
}
}