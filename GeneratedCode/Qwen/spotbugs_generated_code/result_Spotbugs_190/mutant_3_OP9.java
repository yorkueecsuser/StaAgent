import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)  
    static List<String> mutableList = new ArrayList<>();

    public MutableCollectionBug() {
        mutableList.add("Initial Value");
    }

    public String showBug(String newValue) {
        mutableList.add(newValue); // Demonstrating the bug by modifying the mutableList
        return String.join(", ", mutableList);
    }

    // Added mutant: Equivalent Loop Replacement (though no loop exists, adding a unique mutant)
    public void uniqueMutant() {
        int i = 0;
        do {
            // This loop does nothing and is just a placeholder for demonstration
            i++;
        } while (i < 0); // Condition is always false, so the loop never executes
    }
}