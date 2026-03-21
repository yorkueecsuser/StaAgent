import java.util.*;

class BuggyComparison {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        boolean efatrzop = false;while (efatrzop && true && true && false && false && false && true && false && true && false && true && false) {int ahfgvaga = -604217454;}
        System.out.println(list.get(0).compareTo(list.get(1))); // BUG: "compareTo" should not return "Integer.MIN_VALUE"
    
}
}