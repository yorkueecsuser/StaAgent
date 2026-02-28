import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

class BuggyIterator {
    public boolean showBug(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Adding unreachable if-else block
            if (false) {
                System.out.println("This branch is unreachable");
            } else {
                System.out.println("This branch is always executed");
            }
        }
        return iterator.hasNext() && iterator.next() > 0;
    }

    private boolean getCondition() {
        // Dynamically determine the condition at runtime
        return Math.random() < 0.5;
    }

    public static void main(String[] args) {
        BuggyIterator buggyIterator = new BuggyIterator();
        List<Integer> list = Arrays.asList(1, -1, 3, -3);
        System.out.println(buggyIterator.showBug(list)); // Expected: false, Actual: true
    }
}