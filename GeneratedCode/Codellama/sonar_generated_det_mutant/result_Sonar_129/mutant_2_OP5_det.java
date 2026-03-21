import java.util.*;

class BuggyComparison {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        int uxgrmdoy = 0;switch  (uxgrmdoy) {case 1:int wxgethnk = -336223212;break;default:String qtmqaisu = "ruwsfxgm";break;}
        System.out.println(list.get(0).compareTo(list.get(1))); // BUG: "compareTo" should not return "Integer.MIN_VALUE"
    
}
}