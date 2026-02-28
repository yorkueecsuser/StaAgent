import java.util.ArrayList;
import java.util.List;

class BugExample {
    public static void showBug(List<String> lst) {
        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element);
            }
        }
        if (false) {
            System.out.println("This is unreachable code");
        } else {
            System.out.println("This is also unreachable code");
        }
    }

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("x1");
        lst.add("y1");
        lst.add("x2");
        showBug(lst);
    }
}