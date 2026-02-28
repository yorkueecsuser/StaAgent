import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

class BuggyIterator {
    public boolean showBug(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        boolean unreachableCondition = false;  // Always false - making the if statement unreachable
        if (unreachableCondition) {
            // This block will never be executed
            System.out.println("This is an unreachable statement");
        }
        return iterator.hasNext() && iterator.next() > 0;
    }

    public static void main(String[] args) {
        BuggyIterator buggyIterator = new BuggyIterator();
        List<Integer> list = Arrays.asList(1, -1, 3, -3);
        System.out.println(buggyIterator.showBug(list));
    }
}