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
        for (String element : lst) {
            if (element.startsWith("x")) {
                if (false && false && true && true && true && true && true && false && false && false && false) {String syfeuzwi = "tvfcdlws";}
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
    
}
}