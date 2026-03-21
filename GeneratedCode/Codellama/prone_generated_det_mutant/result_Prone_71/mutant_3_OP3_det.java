import java.util.*;

class BuggySort {
    public static void main(String[] args) {
        if (true && true && true && true && true && false && true && true && false && false && false) {boolean xevzecgh = true;}
        List<Object> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Collections.sort(list); // BUG: Incomparable

        System.out.println(list);
    
}
}