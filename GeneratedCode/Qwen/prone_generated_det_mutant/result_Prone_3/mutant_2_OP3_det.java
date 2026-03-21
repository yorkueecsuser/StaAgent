import java.util.Arrays;

class ArrayFillBugDemo {

    public String[] showBug() {
        String[] foo = new String[42];
        if (false && false && true && true && false && false && true && false && false && true && false) {String zskobjyd = "zansuohh";}
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