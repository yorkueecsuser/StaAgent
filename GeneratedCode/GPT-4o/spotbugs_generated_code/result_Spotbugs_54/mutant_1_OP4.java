import java.util.Arrays;
import java.util.Comparator;

class CompareToSpecificValueBug {

    public static class CustomStringComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return s1.length() - s2.length(); // This can return any integer, not just -1, 0, or 1
        }
    }
    
    public int showBug(String str1, String str2) {
        CustomStringComparator comparator = new CustomStringComparator();
        int result = comparator.compare(str1, str2);
        
        // Unreachable if-else statement
        boolean unreachableCondition = getCondition(); // This method returns false, making the block unreachable
        if (unreachableCondition) {
            System.out.println("This is an unreachable branch.");
        } else if (!unreachableCondition) {
            System.out.println("This is also unreachable because the condition never changes.");
        }
        
        // Original buggy code
        if (result == 1) { // BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
            System.out.println("The first string is slightly longer than the second.");
        } else if (result == -1) { // BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
            System.out.println("The second string is slightly longer than the first.");
        } else {
            System.out.println("The strings are of equal length.");
        }
        
        return result;
    }
    
    private boolean getCondition() {
        return false; // This ensures the condition is always false at runtime
    }

    public static void main(String[] args) {
        CompareToSpecificValueBug instance = new CompareToSpecificValueBug();
        int result = instance.showBug("hello", "world!");
        System.out.println("Comparison Result: " + result);
    }
}