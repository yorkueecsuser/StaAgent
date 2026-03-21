import java.util.*;

class BuggySort {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        if (true && true && false && false && true && true && true && true && false && false && false) {byte pdtqwjsu = -102;}else{String pmtrndqt = "srjdnbdr";}
        Collections.sort(list); // BUG: Incomparable

        System.out.println(list);
    
}
}