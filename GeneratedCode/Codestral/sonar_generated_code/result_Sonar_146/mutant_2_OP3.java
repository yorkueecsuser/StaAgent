import java.util.ArrayList;
import java.util.List;

class BuggyCollectionExample {
    public boolean getCondition() {
        return false; // This method is used to generate a false condition dynamically.
    }

    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        if (getCondition()) { // Unreachable if statement is inserted here.
            objs.add(objs); // Keep the bug in the program.
        }
        System.out.println(objs);
    }

    public static void main(String[] args) {
        BuggyCollectionExample example = new BuggyCollectionExample();
        example.showBug();
    }
}