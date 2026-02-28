// Mutated Java code

import java.util.ArrayList;
import java.util.List;

class ImmutableBug {
    private final List<String> mutableField; // Original immutable bug
    private final List<String> a; // Mutated field name

    public ImmutableBug(List<String> mutableField) {
        this.mutableField = new ArrayList<>(mutableField);
        this.a = new ArrayList<>(mutableField); // Added mutated field
    }

    public List<String> getMutableField() {
        return mutableField;
    }

    public List<String> getA() { // Added getter for the mutated field
        return a;
    }

    public void showBug() {
        getMutableField().add("New Element");
        getA().add("New Element"); // Added operation on the mutated field
    }
}