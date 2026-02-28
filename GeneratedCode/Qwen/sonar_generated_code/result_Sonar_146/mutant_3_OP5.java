import java.util.ArrayList;
import java.util.List;

class CollectionBugDemo {

    public void showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");

        boolean containsAllResult = objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean removeAllResult = objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean retainAllResult = objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods

        System.out.println("containsAllResult: " + containsAllResult);
        System.out.println("removeAllResult: " + removeAllResult);
        System.out.println("retainAllResult: " + retainAllResult);

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is never true
                System.out.println("This is an unreachable case.");
                break;
            case 1:
                // This case will always be reached
                System.out.println("This is the reachable case.");
                break;
        }
    }

    private boolean getCondition() {
        // This method returns false, ensuring the switch statement is mostly unreachable
        return false;
    }

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        demo.showBug();
    }
}