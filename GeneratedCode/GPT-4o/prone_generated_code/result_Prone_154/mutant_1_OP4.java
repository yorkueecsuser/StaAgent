import java.util.ArrayList;
import java.util.List;

class SizeCheckDemo {

    public boolean showBug(List<String> items) {
        // Check if the size of the list is greater than or equals to 0
        boolean condition = items.size() < 0; // This condition will never be true
        if (condition) {
            System.out.println("Unreachable code due to condition being always false.");
        } else {
            // Original code
            return items.size() >= 0; // BUG: SizeGreaterThanOrEqualsZero
        }
        return true; // This return is here to ensure method always returns a boolean
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
    }
}