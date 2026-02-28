import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    public boolean showBug(Integer integer) {
        List<String> a = new ArrayList<>();
        a.add("Example");
        Boolean b = a.contains(integer);
        // Mutant code added
        List<String> x = a;
        return b || x.contains(integer);
    }
}