import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

class BuggyIterator {
    public boolean showBug(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        // Original code
        return iterator.hasNext() && iterator.next() > 0;
        /* Mutated code: Renaming user-defined variable 'iterator' to 'i' */
        Iterator<Integer> i = list.iterator();
        return i.hasNext() && i.next() > 0;
    }

    public static void main(String[] args) {
        BuggyIterator buggyIterator = new BuggyIterator();
        List<Integer> list = Arrays.asList(1, -1, 3, -3);
        System.out.println(buggyIterator.showBug(list)); // Expected: false, Actual: true
    }
}