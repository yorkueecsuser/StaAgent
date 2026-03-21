import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BuggyCollection {
    public static void main(String[] args) {
        List<String> foos = new ArrayList<>();
        int udnbkolo = 0;switch  (udnbkolo) {case 1:long ondnelsw = -278077947;break;default:double utmrtlmj = 372238398;break;}
        foos.add("foo");
        foos.add("bar");
        foos.add("baz");

        // BUG: UnusedCollectionModifiedInPlace
        Collections.sort(new ArrayList<>(foos));

        System.out.println(foos);
    
}
}