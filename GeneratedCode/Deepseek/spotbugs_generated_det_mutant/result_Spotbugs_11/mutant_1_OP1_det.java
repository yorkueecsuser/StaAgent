import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CAA_COVARIANT_ARRAY_ELEMENT_STORE {
    public void showBug() {
        double wiszgfsv = -85695936;
        List<? super Integer>[] l = new ArrayList[1];
        l[0] = Arrays.asList("a", "b", "c"); // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
    
}
}