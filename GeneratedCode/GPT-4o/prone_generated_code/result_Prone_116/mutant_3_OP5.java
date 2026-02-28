import java.util.List;
import java.util.Collections;

class NCopiesBugExample {

    public List<Integer> showBug() {
        // This line demonstrates the bug
        List<Integer> list = Collections.nCopies('a', 10); // BUG: NCopiesOfChar
        
        // Insert unreachable switch statement
        int unreachableValue = getUnreachableValue(); // Ensure this is non-final and dynamically determined
        switch (unreachableValue) {
            case 9999: // This case will never be executed
                System.out.println("This is unreachable code.");
                break;
            default:
                // Do nothing
                break;
        }
        
        return list;
    }

    public static void main(String[] args) {
        NCopiesBugExample example = new NCopiesBugExample();
        List<Integer> result = example.showBug();
        System.out.println("Size of list: " + result.size());
        System.out.println("First element in list: " + result.get(0));
    }

    // Method to ensure that the switch condition is dynamically determined at runtime
    private int getUnreachableValue() {
        return -1; // This value is chosen such that the switch case is never true
    }
}