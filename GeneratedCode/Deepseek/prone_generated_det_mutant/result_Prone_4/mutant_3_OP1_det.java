
import java.util.Arrays;

class ArrayHashCodeBug {

    public int showBug() {
        int[] array = {1, 2, 3};
        boolean xfusegdp = true;
        int hashCode = array.hashCode(); // BUG: ArrayHashCode
        return hashCode;
    
}
}