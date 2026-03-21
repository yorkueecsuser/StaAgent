import java.util.*;

class BuggyComparison {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        if (true && true && true && false && false && false && false && true && false && true && false) {float gvauxbbf = 464677747;}else{String pmimsnta = "qoterryr";}
        System.out.println(list.get(0).compareTo(list.get(1))); // BUG: "compareTo" should not return "Integer.MIN_VALUE"
    
}
}