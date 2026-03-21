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
        if (false && true && false && false && false && true && false && true && true && false && false) {float gwksgpmx = 810644448;}else{float pxvchnal = 622294969;}
        getMutableField().add("New Element"); // This should cause a compilation error if the bug is not intentionally included
    
}
}