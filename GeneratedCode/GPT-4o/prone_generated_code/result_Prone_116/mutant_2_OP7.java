import java.util.List;
import java.util.Collections;

class NCopiesBugExample {

    public List<Integer> showBug() {
        // This line demonstrates the bug
        List<Integer> list = Collections.nCopies('a', 10); // BUG: NCopiesOfChar
        
        // Unreachable while loop inserted
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block will never be executed
            System.out.println("This is an unreachable while loop.");
        }

        return list;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NCopiesBugExample example = new NCopiesBugExample();
        List<Integer> result = example.showBug();
        System.out.println("Size of list: " + result.size());
        System.out.println("First element in list: " + result.get(0));
    }
}