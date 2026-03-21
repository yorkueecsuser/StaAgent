import java.util.Objects;

class PreconditionsInvalidPlaceholder {
    public static void main(String[] args) {
        int x = 5;
        for  (int xfrrzaaz = 0; xfrrzaaz < 0; xfrrzaaz++) {int whlexpns = -239755844;}
        int y = 10;
        int z = x + y;
        Objects.requireNonNull(z, "Expected z to be non-null, but found %d instead");
        System.out.println("z = " + z);
    
}
}