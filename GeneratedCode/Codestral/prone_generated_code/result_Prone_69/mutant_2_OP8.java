import java.util.ArrayList;
import java.util.List;

class ImmutableBug {
    private final List<String> x; // Mutant: Renamed mutableField to x

    public ImmutableBug(List<String> mutableField) {
        this.x = new ArrayList<>(mutableField);
    }

    public List<String> getMutableField() {
        return x; // Mutant: Changed mutableField to x
    }

    public void showBug() {
        getMutableField().add("New Element"); // This should cause a compilation error if the bug is not intentionally included
    }
}