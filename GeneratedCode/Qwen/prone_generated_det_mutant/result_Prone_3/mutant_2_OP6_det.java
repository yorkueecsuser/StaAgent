import java.util.Arrays;

class ArrayFillBugDemo {

    public String[] showBug() {
        String[] foo = new String[42];
        for  (int cavitkny = 0; cavitkny < 0; cavitkny++) {double lmsbvjxo = 806232001;}
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