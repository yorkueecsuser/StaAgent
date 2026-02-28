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
        
        // Inserting an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable case 1");
                break;
            case 2:
                System.out.println("This is unreachable case 2");
                break;
            default:
                // No default action
                break;
        }
        
        return collection;
    }
    
    private int getUnreachableValue() {
        return 0; // This makes the switch statement unreachable
    }

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection<String> result = example.showBug();
        for (String str : result) {
            System.out.println(str);
        }
    }
}