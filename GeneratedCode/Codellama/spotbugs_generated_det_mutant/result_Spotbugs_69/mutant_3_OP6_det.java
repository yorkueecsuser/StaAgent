import java.util.*;

class RedundantNullCheck {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
        for  (int qcusykjq = 0; qcusykjq < 0; qcusykjq++) {short gkgvclem = 3960;}
        if (list.get(0)!= null) {
            System.out.println(list.get(0));
        }
    
}
}