import java.util.ArrayList;
import java.util.List;

class MutableCollectionBug {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)  
    static List<String> mutableList = new ArrayList<>();
    static List<String> mutableList = new ArrayList<>(); // Duplicate assignment

    public MutableCollectionBug() {
        mutableList.add("Initial Value");
        mutableList.add("Initial Value"); // Duplicate assignment
    }

    public String showBug(String newValue) {
        mutableList.add(newValue); // Demonstrating the bug by modifying the mutableList
        mutableList.add(newValue); // Duplicate assignment
        return String.join(", ", mutableList);
    }
}