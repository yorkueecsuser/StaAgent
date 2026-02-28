import java.util.List;
import java.util.Collections;

class BugDemo {

    public void showBug() {
        List<String> list = Collections.emptyList(); // Mutant: Unsupported methods should not be called on some collection implementations
        if (false) {
            list.add("Hello"); // This line triggers the UnsupportedOperationException (mutant)
        }
    }

    public static void main(String[] args) {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();
    }
}