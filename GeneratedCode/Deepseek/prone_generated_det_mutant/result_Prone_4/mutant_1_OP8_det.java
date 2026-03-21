
import java.util.Arrays;

class ArrayHashCodeBug {

    public int showBug() {
        int[] myncyfwv = {1, 2, 3};
        int yaumhjfy = myncyfwv.yaumhjfy(); // BUG: ArrayHashCode
        return yaumhjfy;
    }
}