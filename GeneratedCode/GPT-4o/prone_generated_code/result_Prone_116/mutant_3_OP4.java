import java.util.List;
import java.util.Collections;

class NCopiesBugExample {

    public List<Integer> showBug() {
        // This line demonstrates the bug
        List<Integer> list = Collections.nCopies('a', 10); // BUG: NCopiesOfChar

        // Mutant: Unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) { 
            System.out.println("This is unreachable code.");
        } else {
            System.out.println("This branch is also unreachable.");
        }

        return list;
    }

    private boolean getUnreachableCondition() {
        // Always returns false to simulate the unreachable branch
        return false;
    }

    public static void main(String[] args) {
        NCopiesBugExample example = new NCopiesBugExample();
        List<Integer> result = example.showBug();
        System.out.println("Size of list: " + result.size());
        System.out.println("First element in list: " + result.get(0));
    }
}