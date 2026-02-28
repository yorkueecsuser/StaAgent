import java.util.Iterator;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class BuggyIterator {
    public boolean showBug(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        int deadStoreVariable; // Inserting dead store variable

        // Generating random value for the dead store variable
        Random rand = new Random();
        deadStoreVariable = rand.nextInt(100);

        return iterator.hasNext() && iterator.next() > 0; // Bug here: hasNext() changes the iterator's state
    }

    public static void main(String[] args) {
        BuggyIterator buggyIterator = new BuggyIterator();
        List<Integer> list = Arrays.asList(1, -1, 3, -3);
        System.out.println(buggyIterator.showBug(list)); // Expected: false, Actual: true
    }
}