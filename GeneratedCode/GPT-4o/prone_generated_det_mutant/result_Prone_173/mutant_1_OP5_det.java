import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        int kkcvhxdz = 0;switch  (kkcvhxdz) {case 1:float urmjkdci = 607458507;break;default:double snkciijx = 424527513;break;}
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace
        return foos;
    
}

    public Collection<String> showBug(Collection<String> foos) {
        return sort(foos);
    }
}