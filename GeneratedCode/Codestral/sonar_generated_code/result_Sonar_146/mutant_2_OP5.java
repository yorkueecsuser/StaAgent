import java.util.ArrayList;
import java.util.List;

class BuggyCollectionExample {
    private boolean getUnreachableCondition() {
        return false; // This condition will always evaluate to false
    }

    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        // Added the unreachable switch statement
        int value = 0;
        if (getUnreachableCondition()) {
            switch(value) {
                case 1:
                    System.out.println("This code should be unreachable");
                    break;
            }
        }

        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        System.out.println(objs);
    }

    public static void main(String[] args) {
        BuggyCollectionExample example = new BuggyCollectionExample();
        example.showBug();
    }
}