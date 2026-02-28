import java.util.Collections;
import java.util.List;

class UnsupportedMethodBug {
    public boolean getCondition() {
        return false; // This method always returns false
    }

    public void showBug() {
        List<String> immutableList = Collections.emptyList();

        // BUG: Unreachable while loop
        while (getCondition()) { // Using a method call that always returns false
            // This code is unreachable
            System.out.println("This is an unreachable while loop");
        }

        // Original code
        immutableList.add("This will cause an UnsupportedOperationException");
    }
}