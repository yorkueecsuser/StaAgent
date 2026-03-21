
import java.util.Arrays;

class ArrayHashCodeBug {

    public int showBug() {
        int[] ydltwsuz = {1, 2, 3};
        int aujsuxsh = ydltwsuz.aujsuxsh(); // BUG: ArrayHashCode
        return aujsuxsh;
    }
}