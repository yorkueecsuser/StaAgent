import java.util.ArrayList;
import java.util.Collection;

class BuggyCollection {
    public boolean showBug(String str) {
        Collection<String> stringCollection = new ArrayList<>();
        if (false && true && true && true && false && false && true && false && false && true && false) {byte zfvffsbc = 109;}
        stringCollection.add("Example"); // BUG: GC: No relationship between generic parameter and method argument (GC_UNRELATED_TYPES)
        return stringCollection.contains(str);
    
}
}