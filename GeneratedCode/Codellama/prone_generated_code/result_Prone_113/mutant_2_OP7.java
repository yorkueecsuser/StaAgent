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

        // Unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("This code is unreachable");
        }
    }

    // Helper method to provide a non-final variable for the while loop condition
    private static boolean getCondition() {
        return false;
    }
}