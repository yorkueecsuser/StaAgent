import java.util.List;
import java.util.ArrayList;

class CollectionBug {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo"); // BUG: Unsupported methods should not be called on some collection implementations
        list.add("bar"); // BUG: Unsupported methods should not be called on some collection implementations
    }
}

// Mutated code:

class CollectionBug {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo"); // BUG: Unsupported methods should not be called on some collection implementations
        list.add("bar"); // BUG: Unsupported methods should not be called on some collection implementations

        // Renamed variable "list" to "myList"
        List<String> myList = new ArrayList<>();
        myList.add("foo"); // BUG: Unsupported methods should not be called on some collection implementations
        myList.add("bar"); // BUG: Unsupported methods should not be called on some collection implementations
    }
}