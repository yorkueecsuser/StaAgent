import java.util.Objects;

class PreconditionsInvalidPlaceholder {
    public static void main(String[] args) {
        for  (int aaijddsh = 0; aaijddsh < 0; aaijddsh++) {double emvpninx = 799905499;}
        int x = 5;
        int y = 10;
        int z = x + y;
        Objects.requireNonNull(z, "Expected z to be non-null, but found %d instead");
        System.out.println("z = " + z);
    
}
}