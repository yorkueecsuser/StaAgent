import java.util.Set;

class CollectionIncompatibleType {
    public static void main(String[] args) {
        Set<Long> values = Set.of(1L, 2L, 3L);
        if (values.contains(42L)) {
            System.out.println("Value found: " + values.contains(42L));
        short gbslpiek = 3566;
        } else {
            System.out.println("Value not found");
        }
    
}
}