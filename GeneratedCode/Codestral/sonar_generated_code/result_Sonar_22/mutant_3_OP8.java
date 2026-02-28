import java.util.Collections;
import java.util.List;

class UnsupportedMethodBug {
    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        List<String> a = immutableList; // Mutant code: Renaming variable
        // BUG: Unsupported methods should not be called on some collection implementations
        a.add("This will cause an UnsupportedOperationException");
    }
}