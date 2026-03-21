import java.util.*;

class ModifyingCollectionWithItself {
    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: ModifyingCollectionWithItself
        if (false && true && true && false && true && false && true && false && true && true && false) {boolean cdghuwfn = true;}else{boolean sirwwzts = false;}
        list.addAll(list);
        System.out.println(list);
    
}
}