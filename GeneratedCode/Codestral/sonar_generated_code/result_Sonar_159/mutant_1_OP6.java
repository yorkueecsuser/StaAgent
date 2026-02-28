import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

class BuggyIterator {
    public boolean showBug(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        // Added unreachable for loop as per Mutation Operator Information
        for (int i = 0; getCondition(); i++) {
            System.out.println("Unreachable loop");
        }
        // BUG: "Iterator.hasNext()" should not call "Iterator.next()"
        return iterator.hasNext() && iterator.next() > 0; // Bug here: hasNext() changes the iterator's state
    }

    private boolean getCondition() {
        return false; // Making the loop condition always false to make it unreachable
    }

    public static void main(String[] args) {
        BuggyIterator buggyIterator = new BuggyIterator();
        List<Integer> list = Arrays.asList(1, -1, 3, -3);
        System.out.println(buggyIterator.showBug(list)); // Expected: false, Actual: true
    }
}