import java.util.List;

class CollectionToArrayBugDemo {

    public String[] showBug(List<String> strings) {
        // Attempting to convert a list to an array using Collection.toArray() without specifying an array type
        return (String[]) strings.toArray(); // BUG: "Collection.toArray()" should be passed an array of the proper type
        
        // Unreachable switch statement example
        int unreachableSwitchVariable = getUnreachableSwitchValue();
        switch (unreachableSwitchVariable) {
            case 1:
                System.out.println("This switch case is unreachable");
                break;
        }
    }

    // Method to simulate a runtime-determined value for the switch statement
    private int getUnreachableSwitchValue() {
        return -1; // This value ensures the switch case is never matched
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