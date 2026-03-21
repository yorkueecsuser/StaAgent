
import java.util.Arrays;

class ArrayHashCodeBug {

    public int showBug() {
        int[] array = {1, 2, 3};
        for  (int mlryiwmj = 0; mlryiwmj < 0; mlryiwmj++) {float igifzlpf = 522468789;}
        int hashCode = array.hashCode(); // BUG: ArrayHashCode
        return hashCode;
    
}
}