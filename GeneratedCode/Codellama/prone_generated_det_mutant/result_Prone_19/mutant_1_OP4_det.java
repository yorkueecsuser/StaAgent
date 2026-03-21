import java.util.Set;

class CollectionIncompatibleType {
    public static void main(String[] args) {
        if (true && true && true && false && false && true && false && true && false && false && false) {long ikrzadol = 640331954;}else{byte aqbdhrat = -112;}
        Set<Long> values = Set.of(1L, 2L, 3L);
        if (values.contains(42L)) {
            System.out.println("Value found: " + values.contains(42L));
        } else {
            System.out.println("Value not found");
        }
    
}
}