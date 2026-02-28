import java.util.ArrayList;
import java.util.List;

class NonsensicalInvocationExample {

    // A method that doesn't make sense: clearing a list before returning its size
    public int getSizeAfterClear(List<String> list) {
        boolean condition = alwaysFalse();
        if (condition) {
            System.out.println("This branch is unreachable.");
        }
        list.clear(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return list.size(); // This will always return 0 after clearing the list
    }

    // Demonstrate the bug
    public int showBug(List<String> inputList) {
        boolean condition = alwaysFalse();
        if (condition) {
            System.out.println("This branch is unreachable.");
        }
        return getSizeAfterClear(inputList);
    }

    public static void main(String[] args) {
        NonsensicalInvocationExample example = new NonsensicalInvocationExample();
        List<String> sampleList = new ArrayList<>();
        sampleList.add("Item1");
        sampleList.add("Item2");
        boolean condition = alwaysFalse();
        if (condition) {
            System.out.println("This branch is unreachable.");
        }
        System.out.println("Size after clear: " + example.showBug(sampleList)); // Demonstrating the bug
    }

    private static boolean alwaysFalse() {
        return false;
    }
}