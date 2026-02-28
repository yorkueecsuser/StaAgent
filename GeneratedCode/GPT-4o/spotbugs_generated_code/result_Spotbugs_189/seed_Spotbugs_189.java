import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MutableCollectionBugExample {
    
    // A final static mutable collection is declared and initialized
    public static final List<String> mutableList = new ArrayList<>(); // BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)

    public MutableCollectionBugExample() {
        mutableList.add("Initial Value");
    }

    public List<String> showBug(String newValue) {
        // Modifying the mutable collection
        mutableList.add(newValue);
        return mutableList;
    }

    public static void main(String[] args) {
        MutableCollectionBugExample example = new MutableCollectionBugExample();
        System.out.println("Before: " + example.mutableList);
        
        example.showBug("New Value");
        
        System.out.println("After: " + example.mutableList);
    }
}