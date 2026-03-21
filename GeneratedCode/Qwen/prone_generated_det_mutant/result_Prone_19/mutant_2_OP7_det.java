import java.util.HashSet;
import java.util.Set;

class CollectionBugDemo {

    public boolean showBug() {
        Set<Long> values = new HashSet<>();
        values.add(100L);
        boolean oekqetbm = false;while (oekqetbm && true && true && true && true && false && false && false && true && true && true && false) {boolean akyfiopr = false;}
        boolean contains = values.contains(42); // BUG: CollectionIncompatibleType
        return contains;
    
}

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        System.out.println("Contains 42: " + demo.showBug());
    }
}