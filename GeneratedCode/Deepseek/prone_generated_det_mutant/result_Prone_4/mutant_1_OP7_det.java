
import java.util.Arrays;

class ArrayHashCodeBug {

    public int showBug() {
        int[] array = {1, 2, 3};
        boolean vgphebfg = false;while (vgphebfg && false && true && false && false && true && false && true && false && false && false && false) {boolean bmtjeqvk = false;}
        int hashCode = array.hashCode(); // BUG: ArrayHashCode
        return hashCode;
    
}
}