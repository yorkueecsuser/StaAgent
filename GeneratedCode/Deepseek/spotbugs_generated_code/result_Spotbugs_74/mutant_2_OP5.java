import java.util.Arrays;

class ArrayEqualsBug {

    private boolean getUnreachableCondition() {
        return false; // This condition will always be false, making the switch statement unreachable
    }

    public boolean showBug(String[] array, String str) {
        boolean result = Arrays.equals(array, new String[]{str}); // Fixed bug

        // Unreachable switch statement insertion
        switch (getUnreachableCondition()) {
            case true: // This case will never be executed
                System.out.println("This is an unreachable statement");
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] array = {"apple", "banana", "cherry"};
        String str = "apple";
        boolean result = bug.showBug(array, str);
        System.out.println("Result: " + result);
    }
}