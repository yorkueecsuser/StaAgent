import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    public boolean showBug(Integer integer) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Example");

        // Inserted unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This is an unreachable loop");
        }

        // BUG: Inappropriate "Collection" calls should not be made
        return stringList.contains(integer);
    }

    // Method to provide dynamic condition for the while loop
    private boolean getCondition() {
        // Implement your logic here
        return false;
    }
}