import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos)); // BUG: UnusedCollectionModifiedInPlace
        return foos;
    }

    public Collection<String> showBug(Collection<String> foos) {
        return sort(foos);
    }

    // Mutant: Renaming variable 'foos' to 'a'
    public Collection<String> sortMutant(Collection<String> a) {
        Collections.sort(new ArrayList<>(a)); // BUG: UnusedCollectionModifiedInPlace
        return a;
    }

    public Collection<String> showBugMutant(Collection<String> a) {
        return sortMutant(a);
    }
}