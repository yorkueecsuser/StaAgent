import java.util.ArrayList;
import java.util.List;

class BuggyCollectionExample {
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        // Mutant Code - Adding unreachable for loop as per mutation operator
        for (int i = 0; getCondition(); i++) {
            // This loop is unreachable and will never execute
        }

        objs.add(objs);
        System.out.println(objs);
    }

    public static void main(String[] args) {
        BuggyCollectionExample example = new BuggyCollectionExample();
        example.showBug();
    }
}