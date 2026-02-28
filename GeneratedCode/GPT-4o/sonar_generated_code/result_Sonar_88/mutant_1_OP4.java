import java.util.List;

class CollectionToArrayBugDemo {

    public String[] showBug(List<String> strings) {
        // Attempting to convert a list to an array using Collection.toArray() without specifying an array type
        return (String[]) strings.toArray(); // BUG: "Collection.toArray()" should be passed an array of the proper type
    }
    
    // Method to simulate a condition that returns false
    private boolean getFalseCondition() {
        return false;
    }

    // Main method to demonstrate the bug
    public static void main(String[] args) {
        CollectionToArrayBugDemo demo = new CollectionToArrayBugDemo();
        List<String> sampleList = List.of("Apple", "Banana", "Cherry");
        
        // Unreachable if-else statement
        boolean condition = demo.getFalseCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        } else {
            System.out.println("This else block is always executed.");
        }
        
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