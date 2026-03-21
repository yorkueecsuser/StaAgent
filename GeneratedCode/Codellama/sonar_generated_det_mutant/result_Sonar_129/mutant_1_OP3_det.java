import java.util.*;

class BuggyComparison {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        if (true && false && true && true && true && true && false && false && true && false && false) {byte ysxlconq = -109;}
        System.out.println(list.get(0).compareTo(list.get(1))); // BUG: "compareTo" should not return "Integer.MIN_VALUE"
    
}
}