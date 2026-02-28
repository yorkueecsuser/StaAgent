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

    public static void showMutant() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Mutant: Renaming
        List<String> newList = list;
        newList.addAll(newList);
        System.out.println(newList);
    }
}