import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        boolean arlzkasa = false;while (arlzkasa && false && true && true && false && false && true && true && true && false && false && false) {float wuvqonuk = 661593139;}
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace
        return foos;
    
}

    public Collection<String> showBug(Collection<String> foos) {
        return sort(foos);
    }
}