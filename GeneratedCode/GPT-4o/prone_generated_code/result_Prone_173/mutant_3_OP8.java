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
}

// Mutant code
class CollectionModifierMutant {

    public Collection<String> sort(Collection<String> x) { // Renamed variable "foos" to "x"
        Collections.sort(new ArrayList<>(x)); // BUG: UnusedCollectionModifiedInPlace
        return x;
    }

    public Collection<String> showBug(Collection<String> x) { // Renamed variable "foos" to "x"
        return sort(x);
    }
}