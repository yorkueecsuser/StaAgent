import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(Integer integer) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Example");

        // BUG: Inappropriate "Collection" calls should not be made
        boolean containsInteger = stringList.contains(integer);

        // Mutant code: Unreachable if-else statement
        if (getUnreachableCondition()) {
            System.out.println("This is unreachable code");
        } else {
            // Alternative code, not executed but present for compilation
            System.out.println("This is alternative code");
        }

        return containsInteger;
    }
}