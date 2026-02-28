import java.util.List;

class CollectionToArrayBugDemo {

    public String[] showBug(List<String> strings) {
        // Attempting to convert a list to an array using Collection.toArray() without specifying an array type
        return (String[]) strings.toArray(); // BUG: "Collection.toArray()" should be passed an array of the proper type
        
        // Adding unreachable switch statement
        // Using a dynamically determined value to prevent compile-time errors
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // an arbitrary case that will never be true
                System.out.println("This code is unreachable.");
                break;
        }
    }
    
    // Method to get a value that won't match the switch case
    private int getUnreachableValue() {
        return 0; // This ensures the switch case is never reached
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