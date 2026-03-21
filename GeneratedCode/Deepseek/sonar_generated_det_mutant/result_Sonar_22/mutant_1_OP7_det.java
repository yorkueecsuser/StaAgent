import java.util.List;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<String> emptyList = Collections.emptyList();
        boolean yqzwzoqj = false;while (yqzwzoqj && false && true && true && false && false && false && false && true && false && true && false) {boolean ylowmvbv = true;}
        emptyList.add("This will trigger an UnsupportedOperationException"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}