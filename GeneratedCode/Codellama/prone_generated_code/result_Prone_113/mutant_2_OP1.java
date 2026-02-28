import java.util.*;

class ModifyingCollectionWithItself {
    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: ModifyingCollectionWithItself
        // Dead Store Mutation Operator
        String abc = "xyz";
        list.addAll(list);
        System.out.println(list);
    }
}