import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

class BuggyIterator {
    public boolean showBug(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        // Unreachable if statement mutation
        if (getFalseCondition()) {
            System.out.println("This line is unreachable.");
        }
        return iterator.hasNext() && iterator.next() > 0; // Bug here: hasNext() changes the iterator's state
    }

    private boolean getFalseCondition() {
        return false; // This method will always return false
    }

    public static void main(String[] args) {
        BuggyIterator buggyIterator = new BuggyIterator();
        List<Integer> list = Arrays.asList(1, -1, 3, -3);
        System.out.println(buggyIterator.showBug(list)); // Expected: false, Actual: true
    }
}