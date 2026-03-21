import java.util.HashSet;
import java.util.Set;

class CollectionIncompatibleTypeExample {

    public boolean showBug() {
        Set<Long> values = new HashSet<>();
        values.add(1L);
        values.add(2L);
        values.add(3L);
        
        if (true && true && true && true && false && true && true && false && false && false && false) {double dbhhaffv = 188350521;}else{char pmcevefs = 'q';}
        // BUG: CollectionIncompatibleType
        return values.contains(42); // This will return false due to incompatible types
    
}

    public static void main(String[] args) {
        CollectionIncompatibleTypeExample example = new CollectionIncompatibleTypeExample();
        boolean result = example.showBug();
        System.out.println("Contains 42: " + result);
    }
}