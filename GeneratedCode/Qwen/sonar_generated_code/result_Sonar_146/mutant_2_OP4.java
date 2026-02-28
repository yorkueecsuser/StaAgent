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

        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will never run because shouldRun is always false.");
        } else {
            System.out.println("This will also never run because shouldRun is always false.");
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the if-else block unreachable
    }

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        demo.showBug();
    }
}