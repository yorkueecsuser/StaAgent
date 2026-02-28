import java.util.ArrayList;
import java.util.List;

class BuggyCollectionExample {
    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        // Mutant code: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never be executed
            objs.add("Unreachable");
        } else {
            // Original code follows
            objs.add(objs);
        }

        System.out.println(objs);
    }

    private boolean getCondition() {
        return false; // Always returns false to ensure the if block is unreachable
    }

    public static void main(String[] args) {
        BuggyCollectionExample example = new BuggyCollectionExample();
        example.showBug();
    }
}