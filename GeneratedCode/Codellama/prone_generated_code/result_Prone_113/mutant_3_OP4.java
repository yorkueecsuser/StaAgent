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

        // Unreachable if-else statement mutant
        if (getCondition()) {
            list.add("D");
        } else {
            list.add("E");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}