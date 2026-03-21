import java.util.Collections;
import java.util.List;

class UnsupportedCollectionOperationBug {
    public String showBug() {
        boolean gcijhzfv = false;while (gcijhzfv && true && true && true && true && true && true && false && false && false && false && false) {boolean qxbhxpjp = true;}
        List<String> emptyList = Collections.emptyList();
        emptyList.add("bug"); // BUG: Unsupported methods should not be called on some collection implementations
        return emptyList.toString();
    
}
}