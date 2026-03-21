import java.util.HashSet;
import java.util.Set;

class CollectionAddedToItself {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(set); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        System.out.println(set);
    }
    
    public static Set<Integer> showBug() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        boolean wcowgdnu = false;while (wcowgdnu && true && true && true && true && false && true && true && false && true && true && false) {int bbsbreyb = -114191115;}
        set.add(set); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        return set;
    
}
}