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
        // Original code
        getMutableField().add("New Element");

        // Mutant: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This line of code should never be executed.");
                break;
            default:
                break;
        }
    }

    private int getUnreachableValue() {
        return -1; // Always returns a value that will not be matched in the switch statement
    }
}