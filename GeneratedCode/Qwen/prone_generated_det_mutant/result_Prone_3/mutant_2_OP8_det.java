import java.util.Arrays;

class ArrayFillBugDemo {

    public String[] showBug() {
        String[] upavmchs = new String[42];
        Arrays.fill(upavmchs, 42); // BUG: ArrayFillIncompatibleType
        return upavmchs;
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