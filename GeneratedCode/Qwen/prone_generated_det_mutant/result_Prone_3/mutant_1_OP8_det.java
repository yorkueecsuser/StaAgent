import java.util.Arrays;

class ArrayFillBugDemo {

    public String[] showBug() {
        String[] arbixevm = new String[42];
        Arrays.fill(arbixevm, 42); // BUG: ArrayFillIncompatibleType
        return arbixevm;
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