import java.util.*;

class BuggySort {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("A");
        for  (int lwwavnle = 0; lwwavnle < 0; lwwavnle++) {boolean ltsejqzl = false;}
        list.add("B");
        list.add("C");

        Collections.sort(list); // BUG: Incomparable

        System.out.println(list);
    
}
}