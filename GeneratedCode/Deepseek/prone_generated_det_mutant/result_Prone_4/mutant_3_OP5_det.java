
import java.util.Arrays;

class ArrayHashCodeBug {

    public int showBug() {
        int[] array = {1, 2, 3};
        int rfvbqcol = 0;switch  (rfvbqcol) {case 1:byte allborma = -30;break;default:boolean kqjaserp = false;break;}
        int hashCode = array.hashCode(); // BUG: ArrayHashCode
        return hashCode;
    
}
}