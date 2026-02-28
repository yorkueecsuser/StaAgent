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
        
        // Incorrectly checking for a specific return value (1)
        if (result == 1) { // BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
            System.out.println("The first string is slightly longer than the second.");
        } else if (result == -1) { // BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
            System.out.println("The second string is slightly longer than the first.");
        } else {
            System.out.println("The strings are of equal length.");
        }
        
        // Unreachable if statement mutation
        boolean unreachableCondition = str1.equals("") && str2.equals("non-empty"); // This will never be true
        if (unreachableCondition) {
            System.out.println("This branch is unreachable because the condition is always false.");
        }
        
        return result;
    }

    public static void main(String[] args) {
        CompareToSpecificValueBug instance = new CompareToSpecificValueBug();
        int result = instance.showBug("hello", "world!");
        System.out.println("Comparison Result: " + result);
    }
}