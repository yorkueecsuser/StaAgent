import java.util.*;

class BuggySort {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        for  (int opggqgai = 0; opggqgai < 0; opggqgai++) {float nddnsruq = 459818088;}
        list.add("C");

        Collections.sort(list); // BUG: Incomparable

        System.out.println(list);
    
}
}