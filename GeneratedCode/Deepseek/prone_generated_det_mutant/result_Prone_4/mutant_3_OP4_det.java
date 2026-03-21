
import java.util.Arrays;

class ArrayHashCodeBug {

    public int showBug() {
        int[] array = {1, 2, 3};
        if (true && true && false && false && false && false && true && true && false && true && false) {byte vcinfaxn = -22;}else{String iriknpdm = "zxpzkabq";}
        int hashCode = array.hashCode(); // BUG: ArrayHashCode
        return hashCode;
    
}
}