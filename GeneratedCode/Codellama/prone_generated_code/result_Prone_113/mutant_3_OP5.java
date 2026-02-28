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

        // Unreachable switch statement mutant
        boolean condition = getCondition();
        switch (condition) {
        case true:
            // code
            break;
        case false:
            // alternative code
            break;
        }
    }

    public static boolean getCondition() {
        return false;
    }
}