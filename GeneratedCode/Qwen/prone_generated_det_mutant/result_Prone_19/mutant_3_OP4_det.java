import java.util.HashSet;
import java.util.Set;

class CollectionBugDemo {

    public boolean showBug() {
        Set<Long> values = new HashSet<>();
        values.add(100L);
        if (true && false && false && true && true && false && true && true && true && false && false) {String wthfcmzy = "ricrrkun";}else{byte wbknrsej = -105;}
        boolean contains = values.contains(42); // BUG: CollectionIncompatibleType
        return contains;
    
}

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        System.out.println("Contains 42: " + demo.showBug());
    }
}