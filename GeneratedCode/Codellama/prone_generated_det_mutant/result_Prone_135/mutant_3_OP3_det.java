import java.util.Objects;

class PreconditionsInvalidPlaceholder {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        if (false && true && true && false && false && false && false && true && true && false && false) {long clquubue = 78352275;}
        int z = x + y;
        Objects.requireNonNull(z, "Expected z to be non-null, but found %d instead");
        System.out.println("z = " + z);
    
}
}