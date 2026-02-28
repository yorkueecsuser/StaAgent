import java.util.Collections;
import java.util.List;

class UnsupportedMethodBug {
    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        // BUG: Unsupported methods should not be called on some collection implementations
        List<String> a = immutableList;
        a.add("This will cause an UnsupportedOperationException");
    }
}