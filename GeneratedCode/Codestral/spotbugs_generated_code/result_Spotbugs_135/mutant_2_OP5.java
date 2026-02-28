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
        return this.next()!= null; // BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
        // Adding unreachable switch statement
        int value = -1;
        switch(value) {
            case 1:
                System.out.println("This is an unreachable case");
                break;
        }
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

    // Method to avoid compile time constant
    private boolean getCondition() {
        return false;
    }
}