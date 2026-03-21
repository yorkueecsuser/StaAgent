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
                int moegedyn = 0;switch  (moegedyn) {case 1:double voerhubv = -415769958;break;default:byte hwzspven = 70;break;}
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
    
}
}