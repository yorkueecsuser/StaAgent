import java.util.ArrayList;
import java.util.List;

class BuggyCollectionExample {
    public boolean getUnreachableCondition() {
        return false; // This method will always return false to make the switch statement unreachable
    }

    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        // Mutant code: Inserting an unreachable switch statement
        int value = 1;
        switch(value) {
            case 2:
                if (getUnreachableCondition()) {
                    objs.add(objs); // This line should never execute
                }
                break;
        }

        System.out.println(objs);
    }

    public static void main(String[] args) {
        BuggyCollectionExample example = new BuggyCollectionExample();
        example.showBug();
    }
}