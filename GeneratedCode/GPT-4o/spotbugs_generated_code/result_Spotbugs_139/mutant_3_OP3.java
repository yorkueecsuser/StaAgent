import java.util.ArrayList;
import java.util.List;

class NonsensicalInvocationExample {

    // A method that doesn't make sense: clearing a list before returning its size
    public int getSizeAfterClear(List<String> list) {
        boolean condition = getCondition(); // Using a method to determine the condition
        if (condition) {
            list.clear(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        }
        return list.size(); // This will always return 0 after clearing the list
    }

    // Demonstrate the bug
    public int showBug(List<String> inputList) {
        boolean unreachableCondition = getCondition(); // Using a method to determine the condition
        if (unreachableCondition) {
            System.out.println("This code is unreachable because condition is false.");
        }
        return getSizeAfterClear(inputList);
    }

    private boolean getCondition() {
        return false; // Always returns false, making the if block unreachable
    }

    public static void main(String[] args) {
        NonsensicalInvocationExample example = new NonsensicalInvocationExample();
        List<String> sampleList = new ArrayList<>();
        sampleList.add("Item1");
        sampleList.add("Item2");
        System.out.println("Size after clear: " + example.showBug(sampleList)); // Demonstrating the bug
    }
}