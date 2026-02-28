import java.util.Collections;
import java.util.List;

class UnsupportedMethodBug {
    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        // BUG: Unsupported methods should not be called on some collection implementations
        immutableList.add("This will cause an UnsupportedOperationException");
        // BUG: Duplication of the previous comment line to show that the bug is known and should not be repeated
    }
}