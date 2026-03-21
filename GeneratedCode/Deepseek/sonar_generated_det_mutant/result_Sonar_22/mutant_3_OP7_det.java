import java.util.List;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<String> emptyList = Collections.emptyList();
        boolean cvuivcwx = false;while (cvuivcwx && false && false && false && true && true && true && false && false && false && true && false) {boolean hpqjiufh = true;}
        emptyList.add("This will trigger an UnsupportedOperationException"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}