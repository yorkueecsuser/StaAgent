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

        // Mutant code: Unreachable if statement
        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            System.out.println("This line is unreachable and should not be executed.");
        }
    }

    private boolean isUnreachable() {
        return false; // Always returns false to make the if statement unreachable
    }
}