import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    public boolean showBug(Integer integer) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Example");
        // Mutant code: Renaming the variable stringList to l
        List<String> l = stringList;
        // BUG: Inappropriate "Collection" calls should not be made
        return l.contains(integer);
    }
}