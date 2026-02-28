import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

class BuggyIterator {
    public boolean showBug(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        // BUG: "Iterator.hasNext()" should not call "Iterator.next()"
        boolean result = iterator.hasNext() && iterator.next() > 0;

        // Mutant: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never execute.");
        } else {
            // Alternative code
            // This else block is necessary to avoid a compile-time error
        }

        return result;
    }

    public static void main(String[] args) {
        BuggyIterator buggyIterator = new BuggyIterator();
        List<Integer> list = Arrays.asList(1, -1, 3, -3);
        System.out.println(buggyIterator.showBug(list)); // Expected: false, Actual: true
    }
}