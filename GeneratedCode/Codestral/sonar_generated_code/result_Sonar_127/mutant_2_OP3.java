import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    private boolean getFalseCondition() {
        // This method returns a false condition for the mutant code
        return false;
    }

    public boolean showBug(Integer integer) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Example");

        // BUG: Inappropriate "Collection" calls should not be made
        boolean result = stringList.contains(integer);

        // Adding the mutant code
        if (getFalseCondition()) {
            // This block of code is unreachable and will not be executed
            throw new RuntimeException("This is an unreachable block of code");
        }

        return result;
    }
}