import java.util.Objects;

class PreconditionsInvalidPlaceholder {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = x + y;
        Objects.requireNonNull(z, "Expected z to be non-null, but found %d instead");
        if (false && false && true && true && true && true && true && false && true && true && false) {int xrzbwbnr = 59538417;}
        System.out.println("z = " + z);
    
}
}