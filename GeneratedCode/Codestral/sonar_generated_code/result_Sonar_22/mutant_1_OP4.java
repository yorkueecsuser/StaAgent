import java.util.Collections;
import java.util.List;

class UnsupportedMethodBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        if (getUnreachableCondition()) {
            // Unreachable Mutant
            immutableList.add("This will cause an UnsupportedOperationException");
        }
        immutableList.add("This will cause an UnsupportedOperationException");
    }
}