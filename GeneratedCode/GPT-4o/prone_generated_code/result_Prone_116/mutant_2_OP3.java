import java.util.List;
import java.util.Collections;

class NCopiesBugExample {

    public List<Integer> showBug() {
        // This line demonstrates the bug
        List<Integer> list = Collections.nCopies('a', 10); // BUG: NCopiesOfChar
        
        // Adding an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never print!");
        }
        
        return list;
    }

    // Method to provide a dynamic condition for the unreachable if statement
    private boolean getCondition() {
        return false; // Always returns false, making the above if statement unreachable
    }

    public static void main(String[] args) {
        NCopiesBugExample example = new NCopiesBugExample();
        List<Integer> result = example.showBug();
        System.out.println("Size of list: " + result.size());
        System.out.println("First element in list: " + result.get(0));
    }
}