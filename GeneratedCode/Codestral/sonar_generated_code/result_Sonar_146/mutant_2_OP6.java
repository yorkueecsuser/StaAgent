import java.util.ArrayList;
import java.util.List;

class BuggyCollectionExample {
    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        // Added unreachable for loop as per mutation operator
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code will never execute as the condition is always false
            System.out.println("Unreachable code");
        }

        objs.add(objs);
        System.out.println(objs);
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is always false
    }

    public static void main(String[] args) {
        BuggyCollectionExample example = new BuggyCollectionExample();
        example.showBug();
    }
}