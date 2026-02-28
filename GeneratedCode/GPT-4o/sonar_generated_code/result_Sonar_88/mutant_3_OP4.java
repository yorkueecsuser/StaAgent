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

        // Mutation: Unreachable if-else statement
        boolean condition = getCondition(); // Using a method to ensure the condition is determined at runtime
        if (condition) {
            System.out.println("This will never run.");
        } else {
            System.out.println("This is the only branch that will execute.");
        }
    }

    // Method to provide a runtime condition that is always false
    public static boolean getCondition() {
        return false;
    }
}