import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

class BuggyIterator {
    public boolean showBug(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable loop inserted here
            // This loop will never execute as the condition is always false
        }
        return iterator.hasNext() && iterator.next() > 0;
    }

    private boolean getCondition() { // Non-final method to generate loop condition
        return false;
    }

    public static void main(String[] args) {
        BuggyIterator buggyIterator = new BuggyIterator();
        List<Integer> list = Arrays.asList(1, -1, 3, -3);
        System.out.println(buggyIterator.showBug(list)); // Expected: false, Actual: true
    }
}