import java.util.*;

class ModifyingCollectionWithItself {
    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: ModifyingCollectionWithItself
        list.addAll(list);
        System.out.println(list);
    }

    // Dead Store Mutation Operator
    public static void showDeadStoreBug() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Dead Store
        String deadStore = "randomString";

        // BUG: ModifyingCollectionWithItself
        list.addAll(list);
        System.out.println(list);
    }
}