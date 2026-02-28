import java.util.ArrayList;
import java.util.List;

class NonsensicalInvocationExample {

    // A method that doesn't make sense: clearing a list before returning its size
    public int getSizeAfterClear(List<String> list) {
        list.clear(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        
        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be printed");
                break;
            case 2:
                System.out.println("Neither will this");
                break;
            default:
                System.out.println("This is also unreachable");
        }
        
        return list.size(); // This will always return 0 after clearing the list
    }

    // Demonstrate the bug
    public int showBug(List<String> inputList) {
        return getSizeAfterClear(inputList);
    }

    // Method to ensure the switch statement is unreachable
    private int getUnreachableValue() {
        return 0; // The value is set such that no case matches in the switch statement
    }

    public static void main(String[] args) {
        NonsensicalInvocationExample example = new NonsensicalInvocationExample();
        List<String> sampleList = new ArrayList<>();
        sampleList.add("Item1");
        sampleList.add("Item2");
        System.out.println("Size after clear: " + example.showBug(sampleList)); // Demonstrating the bug
    }
}