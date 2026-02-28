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

    // Mutated code starts here
    private int x = 10; // Original variable
    private int y = 20; // Original variable

    public void someMethod() {
        int a = x + y; // Using original variables
        int b = a * 2; // New variable introduced for mutation
        System.out.println(b); // Using new variable
    }

    public void anotherMethod() {
        int c = x - y; // Using original variables
        int d = c / 2; // New variable introduced for mutation
        System.out.println(d); // Using new variable
    }
}