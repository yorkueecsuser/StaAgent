import java.util.ArrayList;
import java.util.List;

class BuggyCollectionExample {
    private boolean getUnreachableCondition() {
        return false; // always return false to make the loop unreachable
    }

    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        // Mutant: Unreachable for loop
        for (int i = 0; getUnreachableCondition(); i++) {
            System.out.println("This line should never be executed!");
        }

        objs.add(objs);
        System.out.println(objs);
    }

    public static void main(String[] args) {
        BuggyCollectionExample example = new BuggyCollectionExample();
        example.showBug();
    }
}