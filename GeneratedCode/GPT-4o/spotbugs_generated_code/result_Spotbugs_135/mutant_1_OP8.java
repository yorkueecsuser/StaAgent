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
        boolean res = example.showBug(list);
        System.out.println("Result from showBug: " + res);
    }

    public boolean showBug(List<Integer> nums) {
        Iterator<Integer> iter = nums.iterator();
        return hasNext(iter);
    }

    // Method that incorrectly uses next() inside hasNext()
    private boolean hasNext(Iterator<Integer> itr) {
        if (itr.hasNext()) {
            itr.next(); // BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
            return true;
        }
        return false;
    }
}