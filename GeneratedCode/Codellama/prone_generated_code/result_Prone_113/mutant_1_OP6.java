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

        // Unreachable for loop
        for (int i = 0; false; i++) {
            // This loop is unreachable because the condition is always false
            // This loop will never be executed, but it will be syntactically correct
            System.out.println("This code is unreachable");
        }
    }
}