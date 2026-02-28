import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

class BuggyIterator {
    public boolean showBug(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        // Mutant: Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 1 : 0) {
            case 1:
                System.out.println("This should never be printed!");
                break;
        }
        return iterator.hasNext() && iterator.next() > 0;
    }

    private boolean getCondition() {
        return false; // Always return false to make the switch unreachable
    }

    public static void main(String[] args) {
        BuggyIterator buggyIterator = new BuggyIterator();
        List<Integer> list = Arrays.asList(1, -1, 3, -3);
        System.out.println(buggyIterator.showBug(list)); // Expected: false, Actual: true
    }
}