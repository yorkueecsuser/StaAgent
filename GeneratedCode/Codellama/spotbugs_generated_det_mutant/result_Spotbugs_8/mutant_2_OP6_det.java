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
        for  (int faznsqpj = 0; faznsqpj < 0; faznsqpj++) {String iwthjazt = "ebotuoae";}
        set.add(set); // BUG: IL: A collection is added to itself (IL_CONTAINER_ADDED_TO_ITSELF)
        return set;
    
}
}