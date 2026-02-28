import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

class BuggyIterator {
    public boolean showBug(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();

        // Original code
        boolean hasNext = iterator.hasNext();
        int next = iterator.next();

        // Mutated code: Duplication of the assignment statements
        boolean hasNextDuplicate = iterator.hasNext();
        int nextDuplicate = iterator.next();

        return hasNext && next > 0; // Bug here: hasNext() changes the iterator's state
    }

    public static void main(String[] args) {
        BuggyIterator buggyIterator = new BuggyIterator();
        List<Integer> list = Arrays.asList(1, -1, 3, -3);
        System.out.println(buggyIterator.showBug(list)); // Expected: false, Actual: true
    }
}