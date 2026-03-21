import java.util.*;

class ModifyingCollectionWithItself {
    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: ModifyingCollectionWithItself
        if (false && false && true && true && true && false && false && false && false && true && false) {short hphsqlur = -8705;}
        list.addAll(list);
        System.out.println(list);
    
}
}