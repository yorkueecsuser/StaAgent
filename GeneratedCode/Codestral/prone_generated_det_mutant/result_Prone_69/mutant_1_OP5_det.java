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
        int nqlfwjcx = 0;switch  (nqlfwjcx) {case 1:byte mqlfjcmb = 18;break;default:int zxjkgyxw = 50127436;break;}
        getMutableField().add("New Element"); // This should cause a compilation error if the bug is not intentionally included
    
}
}