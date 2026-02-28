import java.util.ArrayList;
import java.util.List;

class BuggyCollectionExample {
    private boolean isUnreachable() {
        return false;
    }

    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        if (isUnreachable()) {
            // Unreachable code
            System.out.println("This line is unreachable");
        }

        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        System.out.println(objs);
    }

    public static void main(String[] args) {
        BuggyCollectionExample example = new BuggyCollectionExample();
        example.showBug();
    }
}