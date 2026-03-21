import java.util.Arrays;

class ArrayFillBugDemo {
public String [] showBug() {
    String [] foo = new String [ 42 ];
    foo = new String [ 42 ];
    Arrays.fill(foo , 42);
    return foo;
}

    public static void main(String[] args) {
        ArrayFillBugDemo demo = new ArrayFillBugDemo();
        try {
            demo.showBug();
        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException: " + e.getMessage());
        }
    }
}