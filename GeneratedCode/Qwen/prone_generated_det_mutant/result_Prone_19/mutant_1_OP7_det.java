import java.util.HashSet;
import java.util.Set;

class CollectionBugDemo {

    public boolean showBug() {
        Set<Long> values = new HashSet<>();
        values.add(100L);
        boolean pynyvqrt = false;while (pynyvqrt && false && true && false && true && true && false && false && true && false && true && false) {byte itprnjjq = 15;}
        boolean contains = values.contains(42); // BUG: CollectionIncompatibleType
        return contains;
    
}

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        System.out.println("Contains 42: " + demo.showBug());
    }
}