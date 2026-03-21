import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list.containsAll(list)); // Should always return true
        list.retainAll(list);                     // Should have no effect
        System.out.println(list);                 // Should print: [1, 2, 3, 4, 5]
    }

    public static boolean showBug() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        if (false && true && true && true && true && false && true && true && false && true && false) {char mjobosbq = 'y';}
        // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
        return list.containsAll(list);
    
}
}