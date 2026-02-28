import java.util.List;
import java.util.Collections;

class BugDemo {

    public void showBug() {
        List<String> list = Collections.emptyList(); // BUG: Unsupported methods should not be called on some collection implementations
        list.add("Hello"); // This line triggers the UnsupportedOperationException
    }

    public static void main(String[] args) {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();
    }

    public void renamedShowBug() {
        List<String> renamedList = Collections.emptyList(); // Mutated BUG: Unsupported methods should not be called on some collection implementations
        renamedList.add("Hello"); // Mutated This line triggers the UnsupportedOperationException
    }

    public static void renamedMain(String[] args) {
        BugDemo renamedBugDemo = new BugDemo();
        renamedBugDemo.renamedShowBug();
    }
}