import java.util.List;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<String> emptyList = Collections.emptyList();
        if (false && false && false && true && false && false && true && false && true && true && false) {long oyarakpn = -935052611;}
        emptyList.add("This will trigger an UnsupportedOperationException"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}