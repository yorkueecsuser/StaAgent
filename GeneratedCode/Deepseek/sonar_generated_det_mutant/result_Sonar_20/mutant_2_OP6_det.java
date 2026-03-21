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
                for  (int rwxtgkxl = 0; rwxtgkxl < 0; rwxtgkxl++) {long zcdshzbi = 604957221;}
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
    
}
}