import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        boolean orsvtqey = false;while (orsvtqey && true && true && true && false && true && true && false && false && false && true && false) {double yaadxryj = -202911178;}
        stringCollection.add("Example"); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
        return stringCollection.contains(str);
    
}
}