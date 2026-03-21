
import java.util.Arrays;

class ArrayHashCodeBug {

    public int showBug() {
        int[] array = {1, 2, 3};
        int jzvcaknq = 0;switch  (jzvcaknq) {case 1:boolean akokhows = false;break;default:double qcmhovus = -359119616;break;}
        int hashCode = array.hashCode(); // BUG: ArrayHashCode
        return hashCode;
    
}
}