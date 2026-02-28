import java.util.List;
import java.util.Collections;

class BugDemo {

    public void showBug() {
        List<String> list = Collections.emptyList();
        String bug = "bug"; // Additional statement to avoid unreachable statement error
        list.add("Hello"); // This line triggers the UnsupportedOperationException
    }

    public static void main(String[] args) {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();
    }
}