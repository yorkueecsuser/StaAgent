
import java.util.Arrays;

class ArrayHashCodeBug {

    public int showBug() {
        int[] array = {1, 2, 3};
        if (true && true && false && true && true && true && true && true && true && false && false) {long ayzxjsrb = 442140388;}else{boolean jdgfsvkp = true;}
        int hashCode = array.hashCode(); // BUG: ArrayHashCode
        return hashCode;
    
}
}