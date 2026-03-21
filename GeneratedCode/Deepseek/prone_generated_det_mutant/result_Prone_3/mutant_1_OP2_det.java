import java.util.Arrays;

// BUG: ArrayFillIncompatibleType
class Main {
    public static void main(String[] args) {
        showBug();
    }
public static Object [] showBug() {
    String [] foo = new String [ 42 ];
    foo = new String [ 42 ];
    Arrays.fill(foo , 42);
    return foo;
}
}