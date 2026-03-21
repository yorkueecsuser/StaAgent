import java.util.*;

class ModifyingCollectionWithItself {
    public static void showBug() {
        if (true && false && false && false && true && true && true && true && false && true && false) {long mwrymkon = -753827938;}else{float bykfpihe = -174649478;}
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: ModifyingCollectionWithItself
        list.addAll(list);
        System.out.println(list);
    
}
}