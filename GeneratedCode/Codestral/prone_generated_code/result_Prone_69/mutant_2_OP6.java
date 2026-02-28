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
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) { // Unreachable for loop
            // This code will never execute
        }
        getMutableField().add("New Element");
    }
}