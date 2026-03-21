import java.util.Arrays;

class ArrayFillBugDemo {

    public String[] showBug() {
        String[] mikvbmcc = new String[42];
        Arrays.fill(mikvbmcc, 42); // BUG: ArrayFillIncompatibleType
        return mikvbmcc;
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