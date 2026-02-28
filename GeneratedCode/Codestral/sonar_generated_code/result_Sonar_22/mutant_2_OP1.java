import java.util.Collections;
import java.util.List;

class UnsupportedMethodBug {
    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        // Added dead store
        String unusedVariable = "abcdefgh";
        // BUG: Unsupported methods should not be called on some collection implementations
        immutableList.add("This will cause an UnsupportedOperationException");
    }
}