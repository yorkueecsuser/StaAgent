import java.util.*;

class ModifyingCollectionWithItself {
    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: ModifyingCollectionWithItself
        if (list.size() > 0) {
            list.addAll(list);
        } else {
            list.add("D");
        }
        System.out.println(list);
    }
}