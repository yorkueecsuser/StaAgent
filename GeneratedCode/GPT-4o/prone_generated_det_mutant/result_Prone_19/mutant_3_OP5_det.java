import java.util.HashSet;
import java.util.Set;

class CollectionIncompatibleTypeExample {

    public boolean showBug() {
        Set<Long> values = new HashSet<>();
        values.add(1L);
        values.add(2L);
        values.add(3L);
        
        int nmvohyfq = 0;switch  (nmvohyfq) {case 1:char jqzufrki = 'u';break;default:int tulzdxyi = -40240830;break;}
        // BUG: CollectionIncompatibleType
        return values.contains(42); // This will return false due to incompatible types
    
}

    public static void main(String[] args) {
        CollectionIncompatibleTypeExample example = new CollectionIncompatibleTypeExample();
        boolean result = example.showBug();
        System.out.println("Contains 42: " + result);
    }
}