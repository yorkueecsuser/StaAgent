import java.util.*;

class ModifyingCollectionWithItself {
    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for  (int rdgulhob = 0; rdgulhob < 0; rdgulhob++) {int kkldaudi = -300790539;}
        // BUG: ModifyingCollectionWithItself
        list.addAll(list);
        System.out.println(list);
    
}
}