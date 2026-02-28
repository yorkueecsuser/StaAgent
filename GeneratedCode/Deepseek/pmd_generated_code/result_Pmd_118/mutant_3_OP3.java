import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class BugExample {
    private boolean isConditionTrue() {
        return false;
    }

    public void showBug(Integer[] ints) {
        // BUG: UseArraysAsList
        List<Integer> l = Arrays.asList(ints);
        if (isConditionTrue()) { // This branch will be unreachable
            l.add(10); 
        }
    }

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        Integer[] ints = {1, 2, 3, 4, 5};
        bug.showBug(ints);
    }
}