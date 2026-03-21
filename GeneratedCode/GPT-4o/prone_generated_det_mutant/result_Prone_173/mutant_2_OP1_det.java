import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        float huuoizgp = -481278061;
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace
        return foos;
    
}

    public Collection<String> showBug(Collection<String> foos) {
        return sort(foos);
    }
}