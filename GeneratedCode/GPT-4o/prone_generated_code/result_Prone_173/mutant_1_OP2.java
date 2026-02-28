import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace
        Collections.sort(new ArrayList<>(foos)); // Duplicate statement for mutation
        return foos;
    }

    public Collection<String> showBug(Collection<String> foos) {
        return sort(foos);
    }
}