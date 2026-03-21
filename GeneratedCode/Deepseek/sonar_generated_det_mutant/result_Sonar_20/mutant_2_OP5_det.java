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
            }
        int uxbxgsaa = 0;switch  (uxbxgsaa) {case 1:byte qhxwlvzh = -41;break;default:String foidcmoa = "lwkuxkmn";break;}
        }
    
}
}