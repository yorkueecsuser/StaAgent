import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

class BuggyIterator {
    private boolean getFalseCondition() {
        return false; // This method always returns false
    }

    public boolean showBug(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();

        // Inserting unreachable for loop
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line should never be executed");
        }

        return iterator.hasNext() && iterator.next() > 0;
    }

    public static void main(String[] args) {
        BuggyIterator buggyIterator = new BuggyIterator();
        List<Integer> list = Arrays.asList(1, -1, 3, -3);
        System.out.println(buggyIterator.showBug(list)); // Expected: false, Actual: true
    }
}