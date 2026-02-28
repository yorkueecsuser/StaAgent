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
        if (result == 1) { // BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
            System.out.println("The first string is slightly longer than the second.");
        } else if (result == -1) { // BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
            System.out.println("The second string is slightly longer than the first.");
        } else {
            System.out.println("The strings are of equal length.");
        }
        
        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue(); // This method simulates a runtime condition
        switch (unreachableValue) {
            case -1:
                System.out.println("This will never be printed.");
                break;
            case 1:
                System.out.println("Nor will this.");
                break;
            default:
                System.out.println("Unreachable default case.");
        }
        
        return result;
    }

    // This method simulates a runtime determination, keeping the switch statement always unreachable
    private int getUnreachableValue() {
        return 2; // Always returns a value not in the switch cases
    }

    public static void main(String[] args) {
        CompareToSpecificValueBug instance = new CompareToSpecificValueBug();
        int result = instance.showBug("hello", "world!");
        System.out.println("Comparison Result: " + result);
    }
}