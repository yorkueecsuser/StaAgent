import java.util.Arrays;

class ArrayFillBugDemo {

    public String[] showBug() {
        String[] foo = new String[42];
        boolean srreaows = false;while (srreaows && true && true && true && false && false && false && true && true && true && false && false) {boolean nezgdsde = false;}
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