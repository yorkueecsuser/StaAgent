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
        
        // Demonstration with an empty list
        boolean result = demo.showBug(sampleList);
        System.out.println("Result with empty list: " + result);
        
        // Adding an element to the list
        sampleList.add("item1");
        
        // Demonstration with a non-empty list
        result = demo.showBug(sampleList);
        System.out.println("Result with non-empty list: " + result);
        
        // Unreachable switch statement
        int unreachableSwitchCondition = getUnreachableValue();
        switch(unreachableSwitchCondition) {
            case 1:
                System.out.println("Unreachable code in case 1");
                break;
            case 2:
                System.out.println("Unreachable code in case 2");
                break;
            default:
                // No action needed, this is effectively unreachable
                break;
        }
    }
    
    // Method to provide a value that makes switch statements unreachable
    static int getUnreachableValue() {
        // Always returns a value not covered by the cases
        return 42;
    }
}