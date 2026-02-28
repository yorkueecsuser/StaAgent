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
        boolean conditionWhile = false;
        while (conditionWhile) { // Unreachable while loop
            // This block will never be executed
        }

        getMutableField().add("New Element");
    }
}