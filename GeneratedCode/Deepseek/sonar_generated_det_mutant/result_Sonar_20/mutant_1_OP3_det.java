import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("xhello");
        lst.add("world");
        showBug(lst);
    }

    public static void showBug(List<String> lst) {
        if (true && false && true && true && false && true && true && false && false && true && false) {double esezhhvn = -751294805;}
        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
    
}
}