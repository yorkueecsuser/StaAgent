import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

class BuggyIterator {
    private boolean getCondition() {
        return false;
    }

    public boolean showBug(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();

        // Added unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code - This loop will never execute
            System.out.println("Unreachable code executed!");
        }

        return iterator.hasNext() && iterator.next() > 0; // Bug here: hasNext() changes the iterator's state
    }

    public static void main(String[] args) {
        BuggyIterator buggyIterator = new BuggyIterator();
        List<Integer> list = Arrays.asList(1, -1, 3, -3);
        System.out.println(buggyIterator.showBug(list)); // Expected: false, Actual: true
    }
}