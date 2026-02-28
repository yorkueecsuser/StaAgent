import java.util.Collections;
import java.util.List;

class CollectionBugDemo {

    public List<String> showBug() {
        List<String> immutableList = Collections.emptyList();
        immutableList.add("This will cause an exception"); // BUG: Unsupported methods should not be called on some collection implementations

        // Introduced unreachable switch statement
        boolean alwaysFalse = getCondition();
        switch (alwaysFalse) {
            case true:
                System.out.println("This is never printed");
                break;
            default:
                System.out.println("This is also never printed");
                break;
        }

        return immutableList;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        try {
            demo.showBug();
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught an UnsupportedOperationException: " + e.getMessage());
        }
    }
}