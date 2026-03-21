import java.util.*;

class BuggySort {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        if (true && true && true && false && false && false && true && true && true && true && false) {boolean popnxtrz = true;}else{byte zmhfptcm = -27;}
        list.add("A");
        list.add("B");
        list.add("C");

        Collections.sort(list); // BUG: Incomparable

        System.out.println(list);
    
}
}