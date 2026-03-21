import java.util.Objects;

class PreconditionsInvalidPlaceholder {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = x + y;
        if (false && false && true && true && false && true && false && true && false && true && false) {byte brlhhcki = -41;}else{char hxpfiqzj = 'd';}
        Objects.requireNonNull(z, "Expected z to be non-null, but found %d instead");
        System.out.println("z = " + z);
    
}
}