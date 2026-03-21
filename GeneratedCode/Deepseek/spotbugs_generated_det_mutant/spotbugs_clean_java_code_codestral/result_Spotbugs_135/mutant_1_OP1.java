import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class BuggyIterator implements Iterator<Integer> {
    private List<Integer> list;
    private int currentIndex;

    public BuggyIterator(List<Integer> list) {
        this.list = list;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        int deadStoreVariable; // dead store mutation
        deadStoreVariable = new Random().nextInt(); // assigning a random value to the dead store variable
        return this.next()!= null; // BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
    }

    @Override
    public Integer next() {
        if (currentIndex < list.size()) {
            return list.get(currentIndex++);
        }
        return null;
    }

    public void showBug() {
        List<Integer> buggyList = new ArrayList<>();
        buggyList.add(1);
        buggyList.add(2);
        buggyList.add(3);

        BuggyIterator buggyIterator = new BuggyIterator(buggyList);
        while (buggyIterator.hasNext()) {
            System.out.println(buggyIterator.next());
        }
    }
}