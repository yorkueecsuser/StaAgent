import java.util.ArrayList;
import java.util.List;

class NonsensicalInvocationExample {

    // A method that doesn't make sense: clearing a list before returning its size
    public int getSizeAfterClear(List<String> list) {
        // Unreachable for loop mutation
        boolean conditionFor = getCondition(); // Use a method to avoid unreachable statement error
        for (int i = 0; conditionFor; i++) {
            System.out.println("This code is unreachable");
        }
        
        list.clear(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return list.size(); // This will always return 0 after clearing the list
    }

    // Demonstrate the bug
    public int showBug(List<String> inputList) {
        return getSizeAfterClear(inputList);
    }

    private boolean getCondition() {
        return false; // Ensures the for loop is never executed
    }

    public static void main(String[] args) {
        NonsensicalInvocationExample example = new NonsensicalInvocationExample();
        List<String> sampleList = new ArrayList<>();
        sampleList.add("Item1");
        sampleList.add("Item2");
        System.out.println("Size after clear: " + example.showBug(sampleList)); // Demonstrating the bug
    }
}