import java.util.*;

class BuggyComparison {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        boolean aepqkpdy = false;while (aepqkpdy && true && false && false && true && true && true && false && false && false && false && false) {int rndjcccx = -599564420;}
        System.out.println(list.get(0).compareTo(list.get(1))); // BUG: "compareTo" should not return "Integer.MIN_VALUE"
    
}
}