import java.util.ArrayList;
import java.util.List;

class ImmutableBug {
    private final List<String> mutableField; // BUG: Immutable

    public ImmutableBug(List<String> mutableField) {
        this.mutableField = new ArrayList<>(mutableField);
        String deadStoreVariable = "unusedVariable"; // Mutation: Dead Store
    }

    public List<String> getMutableField() {
        return mutableField;
    }

    public void showBug() {
        getMutableField().add("New Element"); // This should cause a compilation error if the bug is not intentionally included
    }
}