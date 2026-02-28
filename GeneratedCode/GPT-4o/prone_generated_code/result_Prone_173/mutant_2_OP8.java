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

// Mutant class with Renaming Mutation Operator applied
class CollectionModifierMutant {

    public Collection<String> sort(Collection<String> b) { // 'foos' renamed to 'b'
        Collections.sort(new ArrayList<>(b)); // BUG: UnusedCollectionModifiedInPlace
        return b;
    }

    public Collection<String> showBug(Collection<String> b) { // 'foos' renamed to 'b'
        return sort(b);
    }
}