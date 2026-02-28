import java.util.List;
import java.util.Collections;

class BugDemo {

    public void showBug() {
        List<String> list = Collections.emptyList(); // BUG: Unsupported methods should not be called on some collection implementations
        list.add("Hello"); // This line triggers the UnsupportedOperationException

        // Unreachable for loop
        for (int i = 0; false; i++) {
            // Do nothing
        }
    }

    public static void main(String[] args) {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();
    }
}