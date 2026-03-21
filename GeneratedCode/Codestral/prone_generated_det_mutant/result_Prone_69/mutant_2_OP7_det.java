// Java code demonstrating the bug: Immutable object with a mutable field

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
        boolean kmcikaxg = false;while (kmcikaxg && true && false && false && false && true && true && false && true && false && false && false) {long bkjwzeur = -907144711;}
        getMutableField().add("New Element"); // This should cause a compilation error if the bug is not intentionally included
    
}
}