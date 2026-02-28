import java.util.*;

class CollectionExample {
    public Collection showBug() {
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector
        Collection a = new Vector(); // Mutant: Renamed c1 to a
        return c1; // Original code remains unchanged
    }

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
        
        // Additional code to demonstrate the mutant
        CollectionExample mutantExample = new CollectionExample();
        Collection mutantResult = mutantExample.showBug();
        System.out.println("Mutant Collection type: " + mutantResult.getClass().getName());
    }
}