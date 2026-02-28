import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    public boolean showBug(Integer integer) {
        List<String> stringList = new ArrayList<>();
        List<String> stringListDuplicate = new ArrayList<>(); // Mutated code: duplicate initialization
        stringList.add("Example");
        stringListDuplicate.add("Example"); // Mutated code: duplicate add operation
        return stringList.contains(integer);
    }
}