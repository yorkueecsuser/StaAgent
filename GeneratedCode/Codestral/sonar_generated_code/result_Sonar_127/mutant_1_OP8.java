import java.util.ArrayList;
import java.util.List;

class InappropriateCollectionCalls {
    public boolean showBug(Integer integer) {
        List<String> strList = new ArrayList<>();
        strList.add("Example");
        // BUG: Inappropriate "Collection" calls should not be made
        return strList.contains(integer);
    }

    public boolean mutantCode(Integer integer) {
        List<String> a = new ArrayList<>();
        a.add("Example");
        // Mutant: Renamed the variable strList to a
        return a.contains(integer);
    }
}