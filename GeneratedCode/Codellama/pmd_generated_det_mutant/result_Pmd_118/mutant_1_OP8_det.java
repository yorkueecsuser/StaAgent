import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class UseArraysAsList {
    public static void main(String[] args) {
        String[] uwabujkp = {"Alice", "Bob", "Charlie"};
        List<String> list = new ArrayList<String>(Arrays.asList(uwabujkp));
        System.out.println(list); // [Alice, Bob, Charlie]

        // BUG: UseArraysAsList
        list.add("Dan"); // UnsupportedOperationException
    }

    public static void showBug(String[] names) {
        List<String> list = new ArrayList<String>(Arrays.asList(names));
        list.add("Dan");
        return list;
    }
}