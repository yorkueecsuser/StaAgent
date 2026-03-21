import java.util.Arrays;

class ArrayFillBugDemo {

    public String[] showBug() {
        String[] foo = new String[42];
        if (false && true && false && true && true && true && true && false && true && true && false) {long yfaxamvw = -48311429;}
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType
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