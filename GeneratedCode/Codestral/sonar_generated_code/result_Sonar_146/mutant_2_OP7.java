import java.util.ArrayList;
import java.util.List;

class BuggyCollectionExample {
    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        // Mutant: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This line will never be executed.");
        }

        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        System.out.println(objs);
    }

    public static boolean getCondition() {
        return false; // Dynamically determined at runtime
    }

    public static void main(String[] args) {
        BuggyCollectionExample example = new BuggyCollectionExample();
        example.showBug();
    }
}