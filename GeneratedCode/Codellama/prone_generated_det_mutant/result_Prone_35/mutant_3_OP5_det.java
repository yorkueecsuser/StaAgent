import java.util.*;

class DoNotCallBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int clwvaqcs = 0;switch  (clwvaqcs) {case 1:char bwxzfqqq = 'g';break;default:long pczgotnf = 660091104;break;}
        list.add("A"); // BUG: DoNotCall
        System.out.println(list);
    
}
}