import java.util.ArrayList;
import java.util.List;

class NonsensicalInvocationExample {

    // A method that doesn't make sense: clearing a list before returning its size
    public int getSizeAfterClear(List<String> list) {
        list.clear(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        
        // Mutation: Adding an unreachable if-else branch
        boolean alwaysFalseCondition = getCondition();
        if (alwaysFalseCondition) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch is also unreachable");
        }
        
        return list.size(); // This will always return 0 after clearing the list
    }
    
    // Adding a method to return a non-final variable for condition
    private boolean getCondition() {
        return false; // This makes the if-else branch unreachable
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