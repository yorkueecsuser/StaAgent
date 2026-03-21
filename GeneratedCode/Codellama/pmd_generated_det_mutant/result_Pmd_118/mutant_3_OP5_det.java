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
        int drxodqyj = 0;switch  (drxodqyj) {case 1:float zlyxwdhr = 153656324;break;default:char nwnswiyw = 'i';break;}
        List<String> list = new ArrayList<String>(Arrays.asList(names));
        list.add("Dan");
        return list;
    
}
}