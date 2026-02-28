import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    private boolean getUnreachableCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }

    public boolean showBug(Integer integer) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Example");

        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code is unreachable
            System.out.println("This line should not be executed!");
        }

        // BUG: Inappropriate "Collection" calls should not be made
        return stringList.contains(integer);
    }
}