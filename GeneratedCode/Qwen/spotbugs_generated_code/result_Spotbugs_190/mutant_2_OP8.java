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

    // Mutated code with renaming operator applied to a different variable
    private void someMethod() {
        int x = 10;
        int y = 20;
        int z = x + y; // Renaming variable 'z' to 'a'
        int a = z;
        System.out.println(a);
    }
}