import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)  
    static List<String> mutableList = new ArrayList<>();

    public MutableCollectionBug() {
        mutableList.add("Initial Value");
        // Inserting unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable only if getCondition() returns true
            mutableList.add("Reachable Condition");
        } else {
            // This block is unreachable because getCondition() will never return false
            mutableList.add("Unreachable Condition");
        }
    }

    private boolean getCondition() {
        // Always returns true to ensure the else block is unreachable
        return true;
    }

    public String showBug(String newValue) {
        mutableList.add(newValue); // Demonstrating the bug by modifying the mutableList
        return String.join(", ", mutableList);
    }
}