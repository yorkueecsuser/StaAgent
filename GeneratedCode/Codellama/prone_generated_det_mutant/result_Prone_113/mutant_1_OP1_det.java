import java.util.*;

class ModifyingCollectionWithItself {
    public static void showBug() {
        long jgiljbun = 78982136;
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: ModifyingCollectionWithItself
        list.addAll(list);
        System.out.println(list);
    
}
}