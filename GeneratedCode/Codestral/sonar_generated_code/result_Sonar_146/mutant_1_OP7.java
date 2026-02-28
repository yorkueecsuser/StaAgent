import java.util.ArrayList;
import java.util.List;

class BuggyCollectionExample {
    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        // BUG: Collections should not be passed as arguments to their own methods
        objs.add(objs);

        // Adding unreachable while loop after the buggy line
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never be executed
        }

        System.out.println(objs);
    }

    // This method returns false to ensure the while loop is unreachable
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BuggyCollectionExample example = new BuggyCollectionExample();
        example.showBug();
    }
}