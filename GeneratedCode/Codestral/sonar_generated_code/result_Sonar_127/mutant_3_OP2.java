import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    public boolean showBug(Integer integer) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Example");
        stringList.add("Example"); // Mutant: Duplicate the assignment statement
        // BUG: Inappropriate "Collection" calls should not be made
        return stringList.contains(integer);
    }
}