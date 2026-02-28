import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

class BuggyIterator implements Iterator<Integer> {
    private List<Integer> list;
    private int index;  // Mutation: Renamed currentIndex to index

    public BuggyIterator(List<Integer> list) {
        this.list = list;
        this.index = 0;  // Updated variable name
    }

    @Override
    public boolean hasNext() {
        return this.next()!= null;  // Bug: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
    }

    @Override
    public Integer next() {
        if (index < list.size()) {  // Updated variable name
            return list.get(index++);  // Updated variable name
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