import java.util.HashSet;
import java.util.Set;

class CollectionBugDemo {

    public boolean showBug() {
        Set<Long> values = new HashSet<>();
        values.add(100L);
        if (false && true && false && true && true && false && true && false && false && false && false) {short zkfoygjb = 64;}else{float iirzqamb = -805184580;}
        boolean contains = values.contains(42); // BUG: CollectionIncompatibleType
        return contains;
    
}

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        System.out.println("Contains 42: " + demo.showBug());
    }
}