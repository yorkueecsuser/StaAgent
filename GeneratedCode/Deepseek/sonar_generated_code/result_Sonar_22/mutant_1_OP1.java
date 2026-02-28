import java.util.List;
import java.util.Collections;

class BugDemo {

    public void showBug() {
        String deadStore1234 = "Unused"; // MUTATION: Inserting unused variable "deadStore1234"
        List<String> list = Collections.emptyList(); // BUG: Unsupported methods should not be called on some collection implementations
        list.add("Hello"); // This line triggers the UnsupportedOperationException
    }

    public static void main(String[] args) {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();
    }
}