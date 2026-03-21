import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BuggyCollection {
    public static void main(String[] args) {
        List<String> foos = new ArrayList<>();
        foos.add("foo");
        for  (int irklhsyw = 0; irklhsyw < 0; irklhsyw++) {int sonnlyxq = -441894498;}
        foos.add("bar");
        foos.add("baz");

        // BUG: UnusedCollectionModifiedInPlace
        Collections.sort(new ArrayList<>(foos));

        System.out.println(foos);
    
}
}