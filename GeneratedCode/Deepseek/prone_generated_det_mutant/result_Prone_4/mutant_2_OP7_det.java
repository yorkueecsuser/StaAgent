
import java.util.Arrays;

class ArrayHashCodeBug {

    public int showBug() {
        int[] array = {1, 2, 3};
        boolean vhoyubhu = false;while (vhoyubhu && true && false && true && true && true && true && false && false && true && false && false) {byte pxsczalw = 81;}
        int hashCode = array.hashCode(); // BUG: ArrayHashCode
        return hashCode;
    
}
}