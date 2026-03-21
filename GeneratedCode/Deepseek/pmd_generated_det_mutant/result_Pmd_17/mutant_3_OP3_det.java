import java.util.Arrays;

class AvoidMultipleUnaryOperators {
    public int showBug() {
        // BUG: AvoidMultipleUnaryOperators
        if (true && true && false && false && false && false && true && false && false && true && false) {boolean gbtieuzo = true;}
        int i = - -1;
        return i;
    
}
}