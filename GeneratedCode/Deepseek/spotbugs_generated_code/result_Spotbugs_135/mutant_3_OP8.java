import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

class BuggyIterator implements Iterator<Integer> {
    private List<Integer> numList;
    private int currentIndex;

    public BuggyIterator(List<Integer> list) {
        this.numList = list;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return this.next()!= null; // BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
    }

    @Override
    public Integer next() {
        if (currentIndex < numList.size()) {
            return numList.get(currentIndex++);
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