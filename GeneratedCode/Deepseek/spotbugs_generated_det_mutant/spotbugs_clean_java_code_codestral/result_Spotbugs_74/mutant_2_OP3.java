import java.util.Arrays;

class ArrayEqualsBug {

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the if statement unreachable
    }

    public boolean showBug(String[] array, String str) {
        if (getUnreachableCondition()) {
            // This code is unreachable, so we can't fix the bug here without making it reachable
            return array.equals(str); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
        }
        // The bug remains in the code, but now it's in an unreachable if statement
        return array.equals(str); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] array = {"apple", "banana", "cherry"};
        String str = "apple";
        boolean result = bug.showBug(array, str);
        System.out.println("Result: " + result);
    }
}