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
        int muqsabxo = 0;switch  (muqsabxo) {case 1:String xcxhraqz = "aqwtuesw";break;default:double nzppjefb = -289719088;break;}
        list.add("Dan");
        return list;
    
}
}