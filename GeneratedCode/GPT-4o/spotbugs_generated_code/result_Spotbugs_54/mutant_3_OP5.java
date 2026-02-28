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
        
        // Inserting unreachable switch statement
        int unreachableSwitchValue = getUnreachableValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("Unreachable case 1");
                break;
            case 2:
                System.out.println("Unreachable case 2");
                break;
            default:
                System.out.println("Unreachable default case");
        }
        
        return result;
    }

    // Method to ensure unreachable switch 
    private int getUnreachableValue() {
        // This ensures that the switch statement is dynamically unreachable
        return 0; 
    }

    public static void main(String[] args) {
        CompareToSpecificValueBug instance = new CompareToSpecificValueBug();
        int result = instance.showBug("hello", "world!");
        System.out.println("Comparison Result: " + result);
    }
}