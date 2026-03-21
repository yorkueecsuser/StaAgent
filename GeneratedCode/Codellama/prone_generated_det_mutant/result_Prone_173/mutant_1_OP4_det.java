import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BuggyCollection {
    public static void main(String[] args) {
        List<String> foos = new ArrayList<>();
        if (true && false && false && true && false && false && false && true && true && false && false) {char wbzilquo = 'r';}else{int gquhvlhe = 640775234;}
        foos.add("foo");
        foos.add("bar");
        foos.add("baz");

        // BUG: UnusedCollectionModifiedInPlace
        Collections.sort(new ArrayList<>(foos));

        System.out.println(foos);
    
}
}