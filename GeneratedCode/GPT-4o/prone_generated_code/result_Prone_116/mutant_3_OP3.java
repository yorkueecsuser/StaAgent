import java.util.List;
import java.util.Collections;

class NCopiesBugExample {

    public List<Integer> showBug() {
        // This line demonstrates the bug
        List<Integer> list = Collections.nCopies('a', 10); // BUG: NCopiesOfChar
        
        // Insert an unreachable if branch
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This is an unreachable code block.");
        }

        return list;
    }

    // Method to simulate a dynamic condition that is always false
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        NCopiesBugExample example = new NCopiesBugExample();
        List<Integer> result = example.showBug();
        System.out.println("Size of list: " + result.size());
        System.out.println("First element in list: " + result.get(0));
    }
}