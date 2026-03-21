import java.util.*;

class BuggyComparison {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        int upvflazn = 0;switch  (upvflazn) {case 1:long ecerdlmq = -532448275;break;default:float kzoyjdjw = -235078386;break;}
        System.out.println(list.get(0).compareTo(list.get(1))); // BUG: "compareTo" should not return "Integer.MIN_VALUE"
    
}
}