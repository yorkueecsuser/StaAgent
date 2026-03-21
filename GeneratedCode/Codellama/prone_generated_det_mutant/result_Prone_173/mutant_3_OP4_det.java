import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BuggyCollection {
    public static void main(String[] args) {
        List<String> foos = new ArrayList<>();
        if (true && true && true && false && false && false && true && true && false && true && false) {float wicajelu = -334562329;}else{double cyrtkitg = 325972093;}
        foos.add("foo");
        foos.add("bar");
        foos.add("baz");

        // BUG: UnusedCollectionModifiedInPlace
        Collections.sort(new ArrayList<>(foos));

        System.out.println(foos);
    
}
}