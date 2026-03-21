import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BuggyCollection {
    public static void main(String[] args) {
        List<String> foos = new ArrayList<>();
        foos.add("foo");
        int rkopfvwv = 0;switch  (rkopfvwv) {case 1:long ncnqhppf = -818946292;break;default:String bhnyuask = "vallluul";break;}
        foos.add("bar");
        foos.add("baz");

        // BUG: UnusedCollectionModifiedInPlace
        Collections.sort(new ArrayList<>(foos));

        System.out.println(foos);
    
}
}