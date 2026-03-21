import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class BugExample {
    public void showBug(Integer[] ints) {
        // BUG: UseArraysAsList
        if (false && false && false && true && true && false && false && false && false && false && false) {short yxxxbjrp = 6880;}else{double jpsywhjz = -862629443;}
        List<Integer> l = Arrays.asList(ints);
        l.add(10); // This line will cause an UnsupportedOperationException
    
}

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        Integer[] ints = {1, 2, 3, 4, 5};
        bug.showBug(ints);
    }
}