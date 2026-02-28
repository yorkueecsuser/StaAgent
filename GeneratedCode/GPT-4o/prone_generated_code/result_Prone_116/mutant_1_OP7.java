import java.util.List;
import java.util.Collections;

class NCopiesBugExample {

    public List<Integer> showBug() {
        // This line demonstrates the bug
        List<Integer> list = Collections.nCopies('a', 10); // BUG: NCopiesOfChar
        
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition(); // This will always return false
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }
        
        return list;
    }

    private boolean getCondition() {
        return false; // Makes the while loop condition false at runtime
    }

    public static void main(String[] args) {
        NCopiesBugExample example = new NCopiesBugExample();
        List<Integer> result = example.showBug();
        System.out.println("Size of list: " + result.size());
        System.out.println("First element in list: " + result.get(0));
    }
}