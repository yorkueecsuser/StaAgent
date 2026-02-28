import java.util.ArrayList;
import java.util.List;

class ImmutableBug {
    private final List<String> mutableField; // BUG: Immutable

    public ImmutableBug(List<String> mutableField) {
        this.mutableField = new ArrayList<>(mutableField);
        this.mutableField = new ArrayList<>(mutableField); // Mutated code: Duplicate assignment

        // Remaining code...
    }

    // Remaining code...
}