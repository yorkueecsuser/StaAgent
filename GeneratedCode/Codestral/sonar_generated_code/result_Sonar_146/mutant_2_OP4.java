import java.util.ArrayList;
import java.util.List;

class BuggyCollectionExample {
    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods

        // Inserted unreachable if-else statement
        if (alwaysFalse()) {
            // This code is unreachable
            System.out.println("This is an unreachable statement.");
        } else {
            // This code is always executed
            System.out.println(objs);
        }
    }

    private static boolean alwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        BuggyCollectionExample example = new BuggyCollectionExample();
        example.showBug();
    }
}