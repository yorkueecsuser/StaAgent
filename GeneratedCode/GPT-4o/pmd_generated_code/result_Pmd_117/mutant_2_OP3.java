import java.util.Collection;
import java.util.Vector;

class CollectionExample {

    public Collection<String> showBug() {
        Collection<String> collection = new Vector<>(); // BUG: UseArrayListInsteadOfVector
        collection.add("This");
        collection.add("is");
        collection.add("a");
        collection.add("buggy");
        collection.add("example");
        
        // Introduce an unreachable if statement using a dynamically determined condition
        boolean isConditionMet = checkCondition();
        if (isConditionMet) {
            System.out.println("Unreachable code due to false condition.");
        }
        
        return collection;
    }

    // Method to prevent compile-time constant in the if statement
    private boolean checkCondition() {
        return false; // This method always returns false, making the if statement effectively unreachable
    }

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection<String> result = example.showBug();
        for (String str : result) {
            System.out.println(str);
        }
    }
}