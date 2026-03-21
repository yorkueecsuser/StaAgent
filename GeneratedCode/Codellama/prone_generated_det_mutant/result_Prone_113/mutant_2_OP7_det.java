import java.util.*;

class ModifyingCollectionWithItself {
    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: ModifyingCollectionWithItself
        list.addAll(list);
        boolean yfdzjuaf = false;while (yfdzjuaf && false && false && true && false && false && true && true && true && true && false && false) {char xibkbiur = 'e';}
        System.out.println(list);
    
}
}