import java.util.Collections;
import java.util.List;

class UnsupportedMethodBug {
    public void showBug() {
        List<String> immutableList = Collections.emptyList();

        // Original code
        immutableList.add("This will cause an UnsupportedOperationException");

        // Mutant: Unreachable If-Else Statement
        if (getFalseCondition()) {
            System.out.println("This code will never be executed");
        } else {
            // Empty else block, as the condition is always false
        }
    }

    private boolean getFalseCondition() {
        return false;
    }
}