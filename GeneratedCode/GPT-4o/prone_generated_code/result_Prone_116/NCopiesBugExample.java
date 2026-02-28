import java.util.List;
import java.util.Collections;

class NCopiesBugExample {

    public List<Integer> showBug() {
        // This line demonstrates the bug
        List<Integer> list = Collections.nCopies('a', 10); // BUG: NCopiesOfChar
        
        // Inserting unreachable while loop into the basic block
        boolean conditionWhile = getCondition(); // Non-final variable to avoid compile-time constant
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This will never be printed.");
        }
        
        return list;
    }

    public static void main(String[] args) {
        NCopiesBugExample example = new NCopiesBugExample();
        List<Integer> result = example.showBug();
        System.out.println("Size of list: " + result.size());
        System.out.println("First element in list: " + result.get(0));
    }
    
    // Helper method to ensure the condition is not a compile-time constant
    private boolean getCondition() {
        return false;
    }
}