import java.util.ArrayList;
import java.util.List;

class ImmutableBug {
    private final List<String> mutableField;

    public ImmutableBug(List<String> mutableField) {
        this.mutableField = new ArrayList<>(mutableField);
    }

    public List<String> getMutableField() {
        return mutableField;
    }

    public void showBug() {
        getMutableField().add("New Element");

        // Mutation Operator: Unreachable switch statement
        boolean isFalse = getFalseCondition(); // Dynamically determined at runtime
        if (isFalse) {
            int value = 0; // Always evaluates to a non-case value
            switch (value) {
                case 1:
                    System.out.println("This should never be printed.");
                    break;
            }
        }
    }

    private boolean getFalseCondition() {
        return false; // For demonstration purposes only
    }
}