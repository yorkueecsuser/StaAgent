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
        // Inserted unreachable while loop (start)
        boolean conditionWhile = false; // This condition is always false
        while (conditionWhile) {
            // This code will never execute
        }
        // Inserted unreachable while loop (end)

        getMutableField().add("New Element");
    }
}