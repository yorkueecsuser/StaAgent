import java.util.HashSet;
import java.util.Set;

class CollectionIncompatibleTypeExample {

    public boolean showBug() {
        Set<Long> values = new HashSet<>();
        values.add(1L);
        values.add(2L);
        values.add(3L);
        
        for  (int wrxljxed = 0; wrxljxed < 0; wrxljxed++) {boolean zknhzxad = true;}
        // BUG: CollectionIncompatibleType
        return values.contains(42); // This will return false due to incompatible types
    
}

    public static void main(String[] args) {
        CollectionIncompatibleTypeExample example = new CollectionIncompatibleTypeExample();
        boolean result = example.showBug();
        System.out.println("Contains 42: " + result);
    }
}