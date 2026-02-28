import java.util.ArrayList;
import java.util.List;

class ImmutableBug {
    private final List<String> mutableField; // BUG: Immutable

    public ImmutableBug(List<String> mutableField) {
        this.mutableField = new ArrayList<>(mutableField);
    }

    public List<String> getMutableField() {
        return mutableField;
    }

    public void showBug() {
        getMutableField().add("New Element"); // This should cause a compilation error if the bug is not intentionally included

        boolean unreachableCondition = false; // Unreachable condition
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This is an unreachable block.");
        } else {
            // This block is always executed
            System.out.println("This is a reachable block.");
        }
    }
}