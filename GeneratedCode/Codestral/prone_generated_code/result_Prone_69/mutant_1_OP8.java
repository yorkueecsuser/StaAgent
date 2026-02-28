import java.util.ArrayList;
import java.util.List;

class ImmutableBug {
    private final List<String> f; // Mutant: Renamed variable

    public ImmutableBug(List<String> mutableField) {
        this.f = new ArrayList<>(mutableField); // Updated reference to the renamed variable
    }

    public List<String> getMutableField() {
        return f; // Updated return statement to reflect the renamed variable
    }

    public void showBug() {
        getMutableField().add("New Element"); // This still causes a compilation error because the object is immutable
    }
}