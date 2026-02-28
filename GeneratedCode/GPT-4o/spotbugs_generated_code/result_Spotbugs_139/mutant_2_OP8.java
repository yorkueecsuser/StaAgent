import java.util.ArrayList;
import java.util.List;

class NonsensicalInvocationExample {

    // A method that doesn't make sense: clearing a list before returning its size
    public int getSizeAfterClear(List<String> x) {
        x.clear(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return x.size(); // This will always return 0 after clearing the list
    }

    // Demonstrate the bug
    public int showBug(List<String> y) {
        return getSizeAfterClear(y);
    }

    public static void main(String[] args) {
        NonsensicalInvocationExample example = new NonsensicalInvocationExample();
        List<String> z = new ArrayList<>();
        z.add("Item1");
        z.add("Item2");
        System.out.println("Size after clear: " + example.showBug(z)); // Demonstrating the bug
    }
}