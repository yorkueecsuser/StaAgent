import java.util.ArrayList;
import java.util.List;

class BugExample {
    public static void showBug(List<String> lst) {
        List<String> toRemove = new ArrayList<>();
        for (String element : lst) {
            if (element.startsWith("x")) {
                toRemove.add(element);
            }
        }
        lst.removeAll(toRemove);
    }

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("x1");
        lst.add("y1");
        lst.add("x2");
        showBug(lst);
    }
}