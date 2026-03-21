
import java.util.Arrays;

class ArrayHashCodeBug {

    public int showBug() {
        int[] array = {1, 2, 3};
        byte uecdrodx = -124;
        int hashCode = array.hashCode(); // BUG: ArrayHashCode
        return hashCode;
    
}
}