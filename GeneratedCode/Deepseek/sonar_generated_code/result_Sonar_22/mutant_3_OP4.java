import java.util.List;
import java.util.Collections;

class BugDemo {

    public void showBug() {
        List<String> list = Collections.emptyList(); // BUG: Unsupported methods should not be called on some collection implementations
        list.add("Hello"); // This line triggers the UnsupportedOperationException

        // Mutation on the if-else statement
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            System.out.println("This code will never be reached");
        } else {
            System.out.println("This code will always be executed");
        }
    }

    public static void main(String[] args) {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();
    }
}