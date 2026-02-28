import java.util.ArrayList;
import java.util.List;

class BuggyCollectionExample {
    public boolean getUnreachableCondition() {
        return false; // Method to ensure the condition is always false
    }

    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        // Inserted unreachable while loop
        boolean unreachable = getUnreachableCondition();
        while (unreachable) {
            // This code block is unreachable
            System.out.println("Unreachable code");
        }

        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        System.out.println(objs);
    }

    public static void main(String[] args) {
        BuggyCollectionExample example = new BuggyCollectionExample();
        example.showBug();
    }
}