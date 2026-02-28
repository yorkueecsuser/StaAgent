import java.util.ArrayList;
import java.util.List;

class BuggyCollectionExample {
    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods

        // Mutant: Unreachable switch statement
        int val = getUnusedValue();
        switch (val) {
            case 1:
                // This code is unreachable
                System.out.println("Unreachable code");
                break;
        }

        System.out.println(objs);
    }

    public static int getUnusedValue() {
        return 2; // This value is not used in the switch case
    }

    public static void main(String[] args) {
        BuggyCollectionExample example = new BuggyCollectionExample();
        example.showBug();
    }
}