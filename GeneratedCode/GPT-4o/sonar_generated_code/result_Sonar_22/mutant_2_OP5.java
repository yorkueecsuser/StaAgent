import java.util.Collections;
import java.util.List;

class UnsupportedOperationExample {
    
    public void showBug() {
        List<String> immutableList = Collections.emptyList();
        try {
            immutableList.add("This will cause an exception"); // BUG: Unsupported methods should not be called on some collection implementations
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught an UnsupportedOperationException: " + e.getMessage());
        }
        
        // Unreachable switch statement added as a mutant
        int unreachableCondition = getNonFinalCondition();
        switch (unreachableCondition) {
            case 1: // This case will never be reached
                System.out.println("Unreachable case executed.");
                break;
            default:
                // Default case is intentionally left empty to ensure the switch is syntactically correct
                break;
        }
    }
    
    // Method to provide a condition for the switch statement
    private int getNonFinalCondition() {
        return 0; // Always returns 0, ensuring the switch case is unreachable
    }

    public static void main(String[] args) {
        UnsupportedOperationExample example = new UnsupportedOperationExample();
        example.showBug();
    }
}