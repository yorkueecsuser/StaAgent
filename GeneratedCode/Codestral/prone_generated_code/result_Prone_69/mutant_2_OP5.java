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
        // Mutant Code: Unreachable switch statement
        boolean alwaysFalse = getCondition();
        if (!alwaysFalse) {
            int unreachableValue = 0;
            switch (unreachableValue) {
                case 1:
                    System.out.println("This line should never be executed.");
                    break;
            }
        }
    }

    private boolean getCondition() {
        return false; // This condition ensures the switch statement is always unreachable.
    }
}