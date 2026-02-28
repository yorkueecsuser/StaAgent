import java.util.*;

class ModifyingCollectionWithItself {
    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: ModifyingCollectionWithItself
        boolean shouldRun = getCondition();
        if (shouldRun) {
            list.addAll(list);
        }
        System.out.println(list);
    }

    private static boolean getCondition() {
        // this method returns a dynamically determined boolean value
        // to avoid the unreachable statement error
        return true;
    }
}