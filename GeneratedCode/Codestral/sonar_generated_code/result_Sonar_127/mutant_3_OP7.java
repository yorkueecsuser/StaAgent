import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    public boolean showBug(Integer integer) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Example");

        // Inserted unreachable while loop based on the mutation operator information
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code block is unreachable, as the condition is always false
            System.out.println("Unreachable code block");
        }

        // BUG: Inappropriate "Collection" calls should not be made
        return stringList.contains(integer);
    }

    // Method to return a false condition for the unreachable while loop
    private boolean getCondition() {
        return false;
    }
}