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
        boolean isFalseCondition = getFalseCondition();
        if (isFalseCondition) {
            // Unreachable code
            System.out.println("This code should not be executed.");
        } else {
            getMutableField().add("New Element");
        }
    }

    private boolean getFalseCondition() {
        return false;
    }
}