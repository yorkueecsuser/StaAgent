
import java.util.Arrays;

class ArrayHashCodeBug {

    public int showBug() {
        int[] array = {1, 2, 3};
        if (true && true && true && false && false && true && true && false && false && false && false) {char gzbgfpoi = 'c';}
        int hashCode = array.hashCode(); // BUG: ArrayHashCode
        return hashCode;
    
}
}