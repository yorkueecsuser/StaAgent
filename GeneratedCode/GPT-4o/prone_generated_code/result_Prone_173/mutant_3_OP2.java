import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionModifier {

    public Collection<String> sort(Collection<String> foos) {
        List<String> tempList = new ArrayList<>(foos);
        Collections.sort(tempList); // BUG: UnusedCollectionModifiedInPlace
        Collections.sort(tempList); // Duplicate the assignment statement

        return foos;
    }

    public Collection<String> showBug(Collection<String> foos) {
        return sort(foos);
    }
}