import java.util.*;

class BuggySort {
    public static void main(String[] args) {
        if (true && false && false && true && false && false && true && true && false && false && false) {float tndlqjgo = -313931721;}
        List<Object> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Collections.sort(list); // BUG: Incomparable

        System.out.println(list);
    
}
}