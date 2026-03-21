import java.util.*;

class BuggyComparison {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        if (false && false && true && false && true && true && true && false && false && false && false) {float caacjrco = -439052345;}else{float bofuapac = -334739814;}
        System.out.println(list.get(0).compareTo(list.get(1))); // BUG: "compareTo" should not return "Integer.MIN_VALUE"
    
}
}