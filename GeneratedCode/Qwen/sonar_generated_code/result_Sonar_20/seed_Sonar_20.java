import java.util.ArrayList;
import java.util.List;

class CollectionModificationBug {

    public static List<String> showBug(List<String> lst) {
        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
        return lst;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("xbanana");
        list.add("cherry");
        list.add("xdurian");

        System.out.println("Before calling showBug: " + list);
        List<String> result = showBug(list);
        System.out.println("After calling showBug: " + result);
    }
}