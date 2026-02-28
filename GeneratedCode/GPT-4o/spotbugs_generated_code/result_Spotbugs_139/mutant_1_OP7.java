import java.util.ArrayList;
import java.util.List;

class NonsensicalInvocationExample {

    // A method that doesn't make sense: clearing a list before returning its size
    public int getSizeAfterClear(List<String> list) {
        boolean conditionWhile = getCondition(); // Placeholder for dynamic condition
        while (conditionWhile) { // Unreachable while loop
            System.out.println("This is unreachable code");
        }
        list.clear(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return list.size(); // This will always return 0 after clearing the list
    }
    
    // Method to simulate a dynamic condition
    private boolean getCondition() {
        return false; // This simulates the condition being always false at runtime
    }

    // Demonstrate the bug
    public int showBug(List<String> inputList) {
        return getSizeAfterClear(inputList);
    }

    public static void main(String[] args) {
        NonsensicalInvocationExample example = new NonsensicalInvocationExample();
        List<String> sampleList = new ArrayList<>();
        sampleList.add("Item1");
        sampleList.add("Item2");
        System.out.println("Size after clear: " + example.showBug(sampleList)); // Demonstrating the bug
    }
}