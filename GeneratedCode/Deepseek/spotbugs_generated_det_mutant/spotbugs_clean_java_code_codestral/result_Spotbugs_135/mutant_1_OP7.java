import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

class BuggyIterator implements Iterator<Integer> {
    private List<Integer> list;
    private int currentIndex;

    public BuggyIterator(List<Integer> list) {
        this.list = list;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        boolean conditionWhile = false;
        while (conditionWhile) { // Unreachable while loop
            // This block is unreachable and will never be executed
            System.out.println("This is an unreachable block");
        }
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