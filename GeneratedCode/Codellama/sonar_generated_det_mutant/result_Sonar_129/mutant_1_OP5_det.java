import java.util.*;

class BuggyComparison {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        int iwsnvpfc = 0;switch  (iwsnvpfc) {case 1:boolean renfdkig = false;break;default:boolean lhdisgwh = true;break;}
        System.out.println(list.get(0).compareTo(list.get(1))); // BUG: "compareTo" should not return "Integer.MIN_VALUE"
    
}
}