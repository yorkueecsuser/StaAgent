import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

class UnusedCollectionModifiedInPlaceBug {

    private boolean getFalseCondition() {
        return false;
    }

    public Collection<String> sort(Collection<String> foos) {
        Collections.sort(new ArrayList<>(foos));
        if (getFalseCondition()) {
            // Unreachable code
            throw new RuntimeException("This line should not be reachable");
        } else {
            // Original code
            return foos;
        }
    }

    // Remaining code...
}