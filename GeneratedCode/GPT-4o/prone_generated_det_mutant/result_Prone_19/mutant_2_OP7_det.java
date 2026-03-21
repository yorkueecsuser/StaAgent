import java.util.HashSet;
import java.util.Set;

class CollectionIncompatibleTypeExample {

    public boolean showBug() {
        Set<Long> values = new HashSet<>();
        values.add(1L);
        values.add(2L);
        values.add(3L);
        
        boolean vwavaoct = false;while (vwavaoct && false && false && true && false && false && true && false && true && false && true && false) {char bsirzplt = 'g';}
        // BUG: CollectionIncompatibleType
        return values.contains(42); // This will return false due to incompatible types
    
}

    public static void main(String[] args) {
        CollectionIncompatibleTypeExample example = new CollectionIncompatibleTypeExample();
        boolean result = example.showBug();
        System.out.println("Contains 42: " + result);
    }
}