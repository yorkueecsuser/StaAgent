import java.util.List;
import java.util.Collections;

class NCopiesBugExample {

    public List<Integer> showBug() {
        // This line demonstrates the bug
        List<Integer> list = Collections.nCopies('a', 10); // BUG: NCopiesOfChar
        
        // Insert an unreachable for loop
        boolean conditionFor = getCondition(); // dynamically determined condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line is unreachable");
        }
        
        return list;
    }

    // Method to provide a dynamic condition, ensuring the loop is unreachable
    private boolean getCondition() {
        return false; // Always returns false but determined at runtime
    }

    public static void main(String[] args) {
        NCopiesBugExample example = new NCopiesBugExample();
        List<Integer> result = example.showBug();
        System.out.println("Size of list: " + result.size());
        System.out.println("First element in list: " + result.get(0));
    }
}