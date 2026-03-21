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
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            boolean svpusplt = false;while (svpusplt && false && true && true && true && false && true && false && false && false && false && false) {float pmgjyuxx = 458272165;}
            }
        }
    
}
}