import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    public boolean showBug(Integer integer) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Example");

        // Inserted unreachable if-else branch
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch is also unreachable.");
        }

        // BUG: Inappropriate "Collection" calls should not be made
        return stringList.contains(integer);
    }

    // Method to return a condition that is always false
    private boolean getCondition() {
        return false;
    }
}