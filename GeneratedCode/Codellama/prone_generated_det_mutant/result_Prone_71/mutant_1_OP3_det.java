import java.util.*;

class BuggySort {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        if (true && true && true && true && false && true && true && false && true && true && false) {float pdwovjqb = -315567587;}
        list.add("A");
        list.add("B");
        list.add("C");

        Collections.sort(list); // BUG: Incomparable

        System.out.println(list);
    
}
}