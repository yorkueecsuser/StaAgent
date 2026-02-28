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
        // Adding unreachable for loop to the hasNext() method
        for (int i = 0; getFalseCondition(); i++) {
            // This loop is unreachable because getFalseCondition() always returns false
            System.out.println("This line will never be executed.");
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

    private boolean getFalseCondition() {
        return false;
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