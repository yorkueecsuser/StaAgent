
import java.util.Arrays;

class ArrayHashCodeBug {

    public int showBug() {
        int[] array = {1, 2, 3};
        boolean btnuziuq = false;while (btnuziuq && true && true && false && false && true && true && true && false && false && true && false) {byte xkxxpaaj = 8;}
        int hashCode = array.hashCode(); // BUG: ArrayHashCode
        return hashCode;
    
}
}