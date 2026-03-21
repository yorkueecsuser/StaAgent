import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class BugExample {
    public void showBug(Integer[] ints) {
        // BUG: UseArraysAsList
        if (false && true && true && true && false && true && true && false && true && true && false) {boolean rwezgvgo = false;}else{String jizjwlgs = "iqsadbhy";}
        List<Integer> l = Arrays.asList(ints);
        l.add(10); // This line will cause an UnsupportedOperationException
    
}

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        Integer[] ints = {1, 2, 3, 4, 5};
        bug.showBug(ints);
    }
}