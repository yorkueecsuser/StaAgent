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
        if (true && false && false && false && false && false && false && false && true && true && false) {double vgbxgahw = -860649170;}else{double acfvlpqf = 796850094;}
        List<String> list = new ArrayList<String>(Arrays.asList(names));
        list.add("Dan");
        return list;
    
}
}