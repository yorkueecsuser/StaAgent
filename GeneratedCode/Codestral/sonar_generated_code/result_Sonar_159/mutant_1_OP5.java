import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

class BuggyIterator {
    public boolean showBug(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        // BUG: "Iterator.hasNext()" should not call "Iterator.next()"
        boolean hasNext = iterator.hasNext();

        // Added mutant code
        int unreachableValue = hasNext? 0 : 1;
        switch(unreachableValue) {
            case 1:
                hasNext = iterator.next() > 0;
                break;
        }

        return hasNext;
    }

    public static void main(String[] args) {
        BuggyIterator buggyIterator = new BuggyIterator();
        List<Integer> list = Arrays.asList(1, -1, 3, -3);
        System.out.println(buggyIterator.showBug(list)); // Expected: false, Actual: true
    }
}