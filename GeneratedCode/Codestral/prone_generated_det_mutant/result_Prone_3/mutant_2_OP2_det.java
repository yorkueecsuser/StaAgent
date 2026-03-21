import java.util.Arrays;

class ArrayFillIncompatibleTypeBug {
public static void showBug() {
    String [] foo = new String [ 42 ];
    foo = new String [ 42 ];
    Arrays.fill(foo , 42);
}

    public static void main(String[] args) {
        showBug();
    }
}