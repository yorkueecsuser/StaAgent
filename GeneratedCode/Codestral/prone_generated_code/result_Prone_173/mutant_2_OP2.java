import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class UnusedCollectionModifiedInPlaceBug {

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos)); // Original line
        Collections.sort(new ArrayList<>(foos)); // Mutated line - Duplication of the above line
        return foos;
    }

    // rest of the code remains the same
}