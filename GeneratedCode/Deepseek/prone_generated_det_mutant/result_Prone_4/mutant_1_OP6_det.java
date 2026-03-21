
import java.util.Arrays;

class ArrayHashCodeBug {

    public int showBug() {
        int[] array = {1, 2, 3};
        for  (int cngkmidk = 0; cngkmidk < 0; cngkmidk++) {boolean gqojqtrb = false;}
        int hashCode = array.hashCode(); // BUG: ArrayHashCode
        return hashCode;
    
}
}