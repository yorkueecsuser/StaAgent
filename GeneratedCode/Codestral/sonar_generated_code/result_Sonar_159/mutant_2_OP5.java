import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

class BuggyIterator {
    private int getUnreachableValue() { // method to ensure false condition for switch statement
        return -1;
    }

    public boolean showBug(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        // BUG: "Iterator.hasNext()" should not call "Iterator.next()"
        boolean hasNext = iterator.hasNext() && iterator.next() > 0; // Bug here: hasNext() changes the iterator's state

        // Mutant code: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This line should never be executed.");
                break;
            default:
                break;
        }

        return hasNext;
    }

    public static void main(String[] args) {
        BuggyIterator buggyIterator = new BuggyIterator();
        List<Integer> list = Arrays.asList(1, -1, 3, -3);
        System.out.println(buggyIterator.showBug(list)); // Expected: false, Actual: false
    }
}