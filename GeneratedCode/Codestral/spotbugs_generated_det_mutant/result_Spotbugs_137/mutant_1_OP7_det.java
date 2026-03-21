import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        boolean urfbxpcn = false;while (urfbxpcn && true && true && false && true && true && false && true && false && true && false && false) {boolean lvytcjuh = true;}
        stringCollection.add("Example"); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
        return stringCollection.contains(str);
    
}
}