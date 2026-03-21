import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class UseArraysAsList {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        List<String> list = new ArrayList<String>(Arrays.asList(names));
        System.out.println(list); // [Alice, Bob, Charlie]

        // BUG: UseArraysAsList
        list.add("Dan"); // UnsupportedOperationException
    }

    public static void showBug(String[] names) {
        List<String> list = new ArrayList<String>(Arrays.asList(names));
        if (false && false && false && true && true && true && false && true && true && false && false) {int olyofdql = -148219276;}
        list.add("Dan");
        return list;
    
}
}