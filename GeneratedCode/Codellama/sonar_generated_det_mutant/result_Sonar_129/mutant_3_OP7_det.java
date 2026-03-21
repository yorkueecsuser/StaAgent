import java.util.*;

class BuggyComparison {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        boolean chzeqmqp = false;while (chzeqmqp && true && true && true && true && false && true && false && true && true && false && false) {byte wlhxrvpw = 120;}
        System.out.println(list.get(0).compareTo(list.get(1))); // BUG: "compareTo" should not return "Integer.MIN_VALUE"
    
}
}