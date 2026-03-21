import java.util.Objects;

class PreconditionsInvalidPlaceholder {
    public static void main(String[] args) {
        int x = 5;
        if (true && true && true && true && true && true && false && false && false && true && false) {int xrinpsrm = 379164615;}else{byte pwrdxrnl = -22;}
        int y = 10;
        int z = x + y;
        Objects.requireNonNull(z, "Expected z to be non-null, but found %d instead");
        System.out.println("z = " + z);
    
}
}