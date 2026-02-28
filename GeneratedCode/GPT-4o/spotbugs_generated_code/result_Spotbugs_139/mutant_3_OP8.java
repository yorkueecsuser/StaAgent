import java.util.ArrayList;
import java.util.List;

class NonsensicalInvocationExample {

    // A method that doesn't make sense: clearing a list before returning its size
    public int getSizeAfterClear(List<String> a) { // Renamed "list" to "a"
        a.clear(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return a.size(); // This will always return 0 after clearing the list
    }

    // Demonstrate the bug
    public int showBug(List<String> b) { // Renamed "inputList" to "b"
        return getSizeAfterClear(b);
    }

    public static void main(String[] args) {
        NonsensicalInvocationExample example = new NonsensicalInvocationExample();
        List<String> c = new ArrayList<>(); // Renamed "sampleList" to "c"
        c.add("Item1");
        c.add("Item2");
        System.out.println("Size after clear: " + example.showBug(c)); // Demonstrating the bug
    }
}