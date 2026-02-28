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

        // Unreachable switch statement mutant
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
            default:
                // No operation, ensuring this statement doesn't lead to unreachable code error.
                break;
        }
    }

    private int getUnreachableValue() {
        // This method simulates a condition that will never return 1.
        return 0; // Always returns 0, making the switch case with value 1 unreachable.
    }

    public static void main(String[] args) {
        UnsupportedOperationExample example = new UnsupportedOperationExample();
        example.showBug();
    }
}