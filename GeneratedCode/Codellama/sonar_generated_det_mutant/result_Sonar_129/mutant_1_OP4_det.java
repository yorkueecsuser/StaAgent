import java.util.*;

class BuggyComparison {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        if (true && false && false && true && false && true && true && false && true && false && false) {int wcuknpwj = -508242712;}else{double megurdzy = 686626160;}
        System.out.println(list.get(0).compareTo(list.get(1))); // BUG: "compareTo" should not return "Integer.MIN_VALUE"
    
}
}