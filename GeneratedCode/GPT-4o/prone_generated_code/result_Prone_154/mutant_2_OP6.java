import java.util.ArrayList;
import java.util.List;

class SizeCheckDemo {

    public boolean showBug(List<String> items) {
        // Check if the size of the list is greater than or equals to 0
        return items.size() >= 0; // BUG: SizeGreaterThanOrEqualsZero
    }
    
    private boolean getCondition() {
        // This method returns false to simulate an unreachable condition
        return false;
    }
    
    public static void main(String[] args) {
        SizeCheckDemo demo = new SizeCheckDemo();
        List<String> sampleList = new ArrayList<>();
        
        // Inserting an unreachable for loop
        boolean conditionFor = demo.getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never execute.");
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
}