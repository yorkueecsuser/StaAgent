import java.util.ArrayList;
import java.util.List;

class SizeCheckDemo {

    public boolean showBug(List<String> items) {
        // Check if the size of the list is greater than or equals to 0
        return items.size() >= 0; // BUG: SizeGreaterThanOrEqualsZero
    }
    
    public static void main(String[] args) {
        SizeCheckDemo demo = new SizeCheckDemo();
        List<String> sampleList = new ArrayList<>();
        
        // Unreachable switch statement mutation
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
            default:
                // Default case to avoid compile-time errors
                break;
        }
        
        // Demonstration with an empty list
        boolean result = demo.showBug(sampleList);
        System.out.println("Result with empty list: " + result);
        
        // Adding an element to the list
        sampleList.add("item1");
        
        // Demonstration with a non-empty list
        result = demo.showBug(sampleList);
        System.out.println("Result with non-empty list: " + result);
    }
    
    // Method to provide a non-final condition that makes the switch statement unreachable
    public static int getUnreachableCondition() {
        return 0; // Always returning 0 ensures the switch case never hits the `case 1`.
    }
}