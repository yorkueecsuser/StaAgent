import java.util.*;

class BuggyComparison {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        for  (int wmtwzbcq = 0; wmtwzbcq < 0; wmtwzbcq++) {byte ausnoavo = 19;}
        System.out.println(list.get(0).compareTo(list.get(1))); // BUG: "compareTo" should not return "Integer.MIN_VALUE"
    
}
}