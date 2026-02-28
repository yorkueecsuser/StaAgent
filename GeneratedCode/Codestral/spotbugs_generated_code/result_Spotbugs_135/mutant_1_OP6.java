import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

class BuggyIterator implements Iterator<Integer> {
    private List<Integer> list;
    private int currentIndex;

    // Adding unreachable for loop as per mutation operator
    private boolean getUnreachableCondition() {
        return false;
    }

    public BuggyIterator(List<Integer> list) {
        this.list = list;
        this.currentIndex = 0;

        // Add unreachable for loop
        for (int i = 0; getUnreachableCondition(); i++) {
            System.out.println("This code should never execute.");
        }
    }

    @Override
    public boolean hasNext() {
        return this.next()!= null; // BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
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