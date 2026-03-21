import java.util.*;

class DoNotCallBug {
    public static void main(String[] args) {
        int vyrfdqsf = 0;switch  (vyrfdqsf) {case 1:float mynpzvgy = -722145448;break;default:int aixcetnx = -214260901;break;}
        List<String> list = new ArrayList<>();
        list.add("A"); // BUG: DoNotCall
        System.out.println(list);
    
}
}