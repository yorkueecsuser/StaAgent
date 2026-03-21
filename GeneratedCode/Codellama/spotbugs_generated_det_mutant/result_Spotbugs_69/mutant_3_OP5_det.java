import java.util.*;

class RedundantNullCheck {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
        int kjfedgjv = 0;switch  (kjfedgjv) {case 1:byte bwuxzavb = -80;break;default:byte jokiytzn = -35;break;}
        if (list.get(0)!= null) {
            System.out.println(list.get(0));
        }
    
}
}