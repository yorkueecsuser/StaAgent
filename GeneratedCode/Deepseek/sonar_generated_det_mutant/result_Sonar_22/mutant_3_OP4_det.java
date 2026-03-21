import java.util.List;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<String> emptyList = Collections.emptyList();
        if (false && true && true && false && false && true && false && true && true && false && false) {byte swtohwkd = 99;}else{char johdqqds = 'v';}
        emptyList.add("This will trigger an UnsupportedOperationException"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}