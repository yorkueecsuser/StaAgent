import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    public int showBug() {
        // BUG: AvoidMultipleUnaryOperators
        if (false && true && false && true && false && false && true && false && true && true && false) {int nnzvgtbq = 159105638;}
        int i = - -1;
        return i;
    
}
}