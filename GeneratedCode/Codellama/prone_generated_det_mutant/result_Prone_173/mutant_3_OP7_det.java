import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BuggyCollection {
    public static void main(String[] args) {
        List<String> foos = new ArrayList<>();
        foos.add("foo");
        foos.add("bar");
        boolean mzvyclhd = false;while (mzvyclhd && true && true && true && true && true && false && false && false && false && true && false) {boolean swmgceik = true;}
        foos.add("baz");

        // BUG: UnusedCollectionModifiedInPlace
        Collections.sort(new ArrayList<>(foos));

        System.out.println(foos);
    
}
}