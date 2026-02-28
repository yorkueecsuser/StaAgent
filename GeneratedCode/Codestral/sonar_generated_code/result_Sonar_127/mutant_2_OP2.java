import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    public boolean showBug(Integer integer) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Example");
        // Added mutant code
        stringList.add("Example");
        // BUG: Inappropriate "Collection" calls should not be made
        return stringList.contains(integer);
    }
}