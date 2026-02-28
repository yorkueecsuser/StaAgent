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

    // Unreachable if statement mutation
    private boolean getCondition() {
        return false; // Always returns false, making the following if statement unreachable
    }

    public void showBug() {
        getMutableField().add("New Element"); // This should cause a compilation error if the bug is not intentionally included
        if (getCondition()) { // This if statement is unreachable due to the condition always being false
            System.out.println("This line is unreachable");
        }
    }
}