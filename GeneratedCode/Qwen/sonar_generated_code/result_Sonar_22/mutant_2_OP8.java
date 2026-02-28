import java.util.Collections;
import java.util.List;

class CollectionBugDemo {

    public List<String> showBug() {
        List<String> immutableList = Collections.emptyList();
        immutableList.add("This will cause an exception"); // BUG: Unsupported methods should not be called on some collection implementations
        return immutableList;
    }

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        try {
            demo.showBug();
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught an UnsupportedOperationException: " + e.getMessage());
        }

        // Mutant code with renaming variable
        List<String> x = Collections.emptyList();
        x.add("This will cause an exception"); // BUG: Unsupported methods should not be called on some collection implementations
        return x;
    }
}