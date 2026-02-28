import java.util.List;
import java.util.ArrayList;

class CollectionBug {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo"); // BUG: Unsupported methods should not be called on some collection implementations
        list.add("bar"); // BUG: Unsupported methods should not be called on some collection implementations
    }
}

// Mutant 1: Renaming the variable "list" to "collection"
class CollectionBug {
    
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        collection.add("foo"); // BUG: Unsupported methods should not be called on some collection implementations
        collection.add("bar"); // BUG: Unsupported methods should not be called on some collection implementations
    }
}

// Mutant 2: Renaming the variable "list" to "items"
class CollectionBug {
    
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("foo"); // BUG: Unsupported methods should not be called on some collection implementations
        items.add("bar"); // BUG: Unsupported methods should not be called on some collection implementations
    }
}