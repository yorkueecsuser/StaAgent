import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

class BuggyIterator {
    public boolean showBug(List<Integer> list) {
        Iterator<Integer> iter = list.iterator();  // Renamed 'iterator' to 'iter'
        // BUG: "Iterator.hasNext()" should not call "Iterator.next()"
        return iter.hasNext() && iter.next() > 0; // Bug here: hasNext() changes the iter's state
    }

    public static void main(String[] args) {
        BuggyIterator buggyIterator = new BuggyIterator();
        List<Integer> list = Arrays.asList(1, -1, 3, -3);
        System.out.println(buggyIterator.showBug(list)); // Expected: false, Actual: true
    }
}