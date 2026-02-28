import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    public boolean showBug(Integer integer) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Example");

        // Insert unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This code will never be executed
        }

        return stringList.contains(integer);
    }

    // Method to simulate a condition that always returns false
    private boolean getCondition() {
        return false;
    }
}