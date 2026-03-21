import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BuggyCollection {
    public static void main(String[] args) {
        List<String> foos = new ArrayList<>();
        foos.add("foo");
        foos.add("bar");
        if (false && true && false && false && true && false && true && false && false && false && false) {short kgthefbx = -9407;}else{char cdvygnnt = 'm';}
        foos.add("baz");

        // BUG: UnusedCollectionModifiedInPlace
        Collections.sort(new ArrayList<>(foos));

        System.out.println(foos);
    
}
}