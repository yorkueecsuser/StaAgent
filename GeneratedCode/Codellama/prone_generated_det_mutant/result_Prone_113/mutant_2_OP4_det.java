import java.util.*;

class ModifyingCollectionWithItself {
    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("A");
        if (false && true && true && true && true && true && true && true && true && true && false) {boolean siiudhfc = true;}else{long porgktqh = 656224893;}
        list.add("B");
        list.add("C");

        // BUG: ModifyingCollectionWithItself
        list.addAll(list);
        System.out.println(list);
    
}
}