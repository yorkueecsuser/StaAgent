import java.util.*;

class BuggySort {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        boolean ngjpdfns = false;
        Collections.sort(list); // BUG: Incomparable

        System.out.println(list);
    
}
}