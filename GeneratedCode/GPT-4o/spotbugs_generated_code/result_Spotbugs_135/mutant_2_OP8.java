import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

class IteratorExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        IteratorExample example = new IteratorExample();
        boolean result = example.showBug(list);
        System.out.println("Result from showBug: " + result);
    }

    public boolean showBug(List<Integer> list) {
        Iterator<Integer> iter = list.iterator();
        return hasNext(iter);
    }

    // Method that incorrectly uses next() inside hasNext()
    private boolean hasNext(Iterator<Integer> iter) {
        if (iter.hasNext()) {
            iter.next(); // BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
            return true;
        }
        return false;
    }
}