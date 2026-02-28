import java.util.Arrays;

class ArrayEqualsBug {

    private boolean getCondition() {
        return false;
    }

    public boolean showBug(String[] array, String str) {
        if (getCondition()) { // Mutated code: Unreachable if statement
            System.out.println("This line is unreachable.");
        }
        return Arrays.equals(array, new String[]{str}); // Fixed bug: Use Arrays.equals() to compare array contents
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] array = {"apple", "banana", "cherry"};
        String str = "apple";
        boolean result = bug.showBug(array, str);
        System.out.println("Result: " + result);
    }
}