import java.util.ArrayList;
import java.util.List;

class BuggyCollectionExample {
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        if (getUnreachableCondition()) {
            objs.add(objs); // This line was in an unreachable branch
        } else {
            objs.add("Mutated"); // Mutated line, add a new element when condition is false
        }

        System.out.println(objs);
    }

    public static void main(String[] args) {
        BuggyCollectionExample example = new BuggyCollectionExample();
        example.showBug();
    }
}