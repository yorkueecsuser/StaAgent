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

    // Unreachable switch statement mutant
    public static void showBugMutant() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        switch(0) {
            case 0:
                list.addAll(list);
                break;
            default:
                break;
        }
        System.out.println(list);
    }
}