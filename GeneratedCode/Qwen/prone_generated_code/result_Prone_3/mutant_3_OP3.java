import java.util.Arrays;

class ArrayFillBugDemo {

    public String[] showBug() {
        String[] foo = new String[42];
        Arrays.fill(foo, 42); // BUG: ArrayFillIncompatibleType

        // Introduced unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable statement.");
        }

        return foo;
    }

    private boolean getCondition() {
        // Always returns false, making the if block unreachable
        return false;
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