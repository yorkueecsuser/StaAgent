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
        boolean unreachableCondition = falseMethod();
        if (unreachableCondition) {
            this.next();
        }
        return this.next()!= null; // Original bug remains
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

    private boolean falseMethod() {
        return false; // This method returns a compile-time constant to make the inserted if branch unreachable
    }
}