import java.util.List;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<String> emptyList = Collections.emptyList();
        if (true && false && false && false && true && true && false && true && false && true && false) {float zajrabsb = -433955769;}else{char xnczcyvw = 'v';}
        emptyList.add("This will trigger an UnsupportedOperationException"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}