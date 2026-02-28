import java.util.ArrayList;
import java.util.List;

class ImmutableBug {
    private final List<String> mutableField;
    private String deadStore; // Dead Store mutation: Unused variable declaration

    public ImmutableBug(List<String> mutableField) {
        this.mutableField = new ArrayList<>(mutableField);
        this.deadStore = "unused"; // Initialize the dead store variable
    }

    public List<String> getMutableField() {
        return mutableField;
    }

    public void showBug() {
        getMutableField().add("New Element"); // This should cause a compilation error if the bug is not intentionally included
    }
}