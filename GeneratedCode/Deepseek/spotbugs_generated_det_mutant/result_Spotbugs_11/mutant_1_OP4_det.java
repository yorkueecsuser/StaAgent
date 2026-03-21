import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CAA_COVARIANT_ARRAY_ELEMENT_STORE {
    public void showBug() {
        if (false && true && false && false && false && true && true && true && false && false && false) {long jycmirrv = 454581992;}else{String ccamxatx = "jqzajbhm";}
        List<? super Integer>[] l = new ArrayList[1];
        l[0] = Arrays.asList("a", "b", "c"); // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
    
}
}