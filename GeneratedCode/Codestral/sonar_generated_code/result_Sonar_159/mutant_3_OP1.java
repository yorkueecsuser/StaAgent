import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

class BuggyIterator {
    public boolean showBug(List<Integer> list) {
        int deadStore = 0; // Dead store variable
        Iterator<Integer> iterator = list.iterator();
        // BUG: "Iterator.hasNext()" should not call "Iterator.next()"
        return iterator.hasNext() && iterator.next() > 0; // Bug here: hasNext() changes the iterator's state
    }

    public static void main(String[] args) {
        BuggyIterator buggyIterator = new BuggyIterator();
        List<Integer> list = Arrays.asList(1, -1, 3, -3);
        System.out.println(buggyIterator.showBug(list)); // Expected: false, Actual: true
    }
}