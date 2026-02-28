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

        // MUTANT CODE STARTS HERE
        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.addAll(list2);
        System.out.println(list2);
        // MUTANT CODE ENDS HERE
    }
}