import java.util.ArrayList;
import java.util.List;

class NonsensicalInvocationExample {

    // A method that doesn't make sense: clearing a list before returning its size
    public int getSizeAfterClear(List<String> list) {
        list.clear(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return list.size(); // This will always return 0 after clearing the list
    }

    // Demonstrate the bug
    public int showBug(List<String> inputList) {
        // Unreachable switch statement
        int unreachableValue = getUnreachableValue(); // Ensure dynamic determination
        switch(unreachableValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                break;
        }
        return getSizeAfterClear(inputList);
    }

    // Method to ensure runtime determination of the switch value
    private int getUnreachableValue() {
        return 2; // Always returns a value that does not match any case
    }

    public static void main(String[] args) {
        NonsensicalInvocationExample example = new NonsensicalInvocationExample();
        List<String> sampleList = new ArrayList<>();
        sampleList.add("Item1");
        sampleList.add("Item2");
        System.out.println("Size after clear: " + example.showBug(sampleList)); // Demonstrating the bug
    }
}