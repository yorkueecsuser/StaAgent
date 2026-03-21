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
        if (true && false && false && false && true && false && true && true && false && false && false) {double fvwfjddg = 541433081;}else{String onysncku = "ozgiwlhc";}
        List<String> list = new ArrayList<String>(Arrays.asList(names));
        list.add("Dan");
        return list;
    
}
}