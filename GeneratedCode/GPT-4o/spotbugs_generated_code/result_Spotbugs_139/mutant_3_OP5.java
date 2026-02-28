import java.util.ArrayList;
import java.util.List;

class NonsensicalInvocationExample {

    // A method that doesn't make sense: clearing a list before returning its size
    public int getSizeAfterClear(List<String> list) {
        list.clear(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)

        // Inserting unreachable switch statement
        int unreachableValue = 10; // Initial value
        if (list.size() > 0) {
            unreachableValue = 20; // Change value only if list is not empty (which is impossible here)
        }
        switch (unreachableValue) {
            case 30:
                System.out.println("This will never be printed."); // Unreachable code
                break;
            default:
                break;
        }

        return list.size(); // This will always return 0 after clearing the list
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