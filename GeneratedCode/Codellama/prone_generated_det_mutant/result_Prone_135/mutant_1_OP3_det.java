import java.util.Objects;

class PreconditionsInvalidPlaceholder {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = x + y;
        Objects.requireNonNull(z, "Expected z to be non-null, but found %d instead");
        if (true && true && false && true && true && true && false && true && true && true && false) {long heooremr = -360573271;}
        System.out.println("z = " + z);
    
}
}