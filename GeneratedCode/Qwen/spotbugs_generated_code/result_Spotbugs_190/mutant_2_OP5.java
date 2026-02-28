import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)  
    static List<String> mutableList = new ArrayList<>();

    public MutableCollectionBug() {
        mutableList.add("Initial Value");
        
        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch(condition) {
            case true:
                // This case is unreachable because getCondition() does not return true
                mutableList.add("Unreachable Case");
                break;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the switch case unreachable
        return false;
    }

    public String showBug(String newValue) {
        mutableList.add(newValue); // Demonstrating the bug by modifying the mutableList
        return String.join(", ", mutableList);
    }
}