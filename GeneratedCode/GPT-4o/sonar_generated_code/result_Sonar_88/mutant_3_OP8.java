import java.util.List;

class CollectionToArrayBugDemo {

    public String[] showBug(List<String> strings) {
        // Attempting to convert a list to an array using Collection.toArray() without specifying an array type
        return (String[]) strings.toArray(); // BUG: "Collection.toArray()" should be passed an array of the proper type
    }
    
    // Main method to demonstrate the bug
    public static void main(String[] args) {
        CollectionToArrayBugDemo demo = new CollectionToArrayBugDemo();
        List<String> sampleList = List.of("Apple", "Banana", "Cherry");
        
        // This will cause a ClassCastException at runtime
        try {
            String[] result = demo.showBug(sampleList);
            for (String s : result) {
                System.out.println(s);
            }
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}

// Mutant code with Variable Renaming
class CollectionToArrayBugDemoMutant {

    public String[] showBug(List<String> a) {
        // Attempting to convert a list to an array using Collection.toArray() without specifying an array type
        return (String[]) a.toArray(); // BUG: "Collection.toArray()" should be passed an array of the proper type
    }
    
    // Main method to demonstrate the bug
    public static void main(String[] args) {
        CollectionToArrayBugDemoMutant demo = new CollectionToArrayBugDemoMutant();
        List<String> b = List.of("Apple", "Banana", "Cherry");
        
        // This will cause a ClassCastException at runtime
        try {
            String[] c = demo.showBug(b);
            for (String s : c) {
                System.out.println(s);
            }
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}