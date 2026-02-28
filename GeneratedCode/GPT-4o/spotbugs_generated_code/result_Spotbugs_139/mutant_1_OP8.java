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

// Mutated code with renamed variable
class MutatedNonsensicalInvocationExample {

    // A method that doesn't make sense: clearing a list before returning its size
    public int getSizeAfterClear(List<String> x) { // Renamed 'list' to 'x'
        x.clear(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return x.size(); // This will always return 0 after clearing the list
    }

    // Demonstrate the bug
    public int showBug(List<String> y) { // Renamed 'inputList' to 'y'
        return getSizeAfterClear(y);
    }

    public static void main(String[] z) { // Renamed 'args' to 'z'
        MutatedNonsensicalInvocationExample example = new MutatedNonsensicalInvocationExample();
        List<String> a = new ArrayList<>(); // Renamed 'sampleList' to 'a'
        a.add("Item1");
        a.add("Item2");
        System.out.println("Size after clear: " + example.showBug(a)); // Demonstrating the bug
    }
}