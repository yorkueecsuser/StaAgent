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
        if (true && true && false && false && true && true && true && false && true && true && false) {String nfblyvry = "erzjvcpz";}else{short ntapfhln = 8560;}
        getMutableField().add("New Element"); // This should cause a compilation error if the bug is not intentionally included
    
}
}