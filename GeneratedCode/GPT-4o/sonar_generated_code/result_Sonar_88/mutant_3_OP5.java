import java.util.List;

class CollectionToArrayBugDemo {

    public String[] showBug(List<String> strings) {
        // Attempting to convert a list to an array using Collection.toArray() without specifying an array type
        return (String[]) strings.toArray(); // BUG: "Collection.toArray()" should be passed an array of the proper type
    }
    
    // Method to provide a runtime condition for the switch statement
    private int getConditionValue() {
        return 0; // The value is set such that the switch cases are unreachable
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

        // Unreachable switch statement
        int switchValue = demo.getConditionValue();
        switch (switchValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            case 2:
                System.out.println("This will also never be printed.");
                break;
            default:
                // The default case is always reached but has no output
                break;
        }
    }
}