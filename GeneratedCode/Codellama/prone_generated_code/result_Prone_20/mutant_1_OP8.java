import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class CollectionToArraySafeParameterBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        String[] array = list.toArray(new String[0]); // BUG: CollectionToArraySafeParameter

        // Renamed variable
        List<String> renamedList = new ArrayList<>();
        renamedList.add("a");
        renamedList.add("b");
        renamedList.add("c");

        String[] renamedArray = renamedList.toArray(new String[0]);
        System.out.println(renamedArray);
    }
}