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
        int value = 0;
        switch (value) {
            case 1:
                System.out.println("Unreachable switch statement mutant");
                break;
            default:
                break;
        }
    }
}