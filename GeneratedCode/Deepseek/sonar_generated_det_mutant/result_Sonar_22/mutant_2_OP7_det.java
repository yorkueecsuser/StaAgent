import java.util.List;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<String> emptyList = Collections.emptyList();
        boolean spqumzbn = false;while (spqumzbn && false && false && false && true && true && true && false && true && false && false && false) {double kfuwrcrx = -690300487;}
        emptyList.add("This will trigger an UnsupportedOperationException"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}