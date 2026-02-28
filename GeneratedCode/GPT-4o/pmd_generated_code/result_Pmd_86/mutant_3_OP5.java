import java.util.Locale;

class CaseConversionExample {

    public boolean showBug(String x) {
        // BUG: UseLocaleWithCaseConversions
        return x.toLowerCase().equals("list"); // This line is buggy due to implicit locale usage
    }

    public static void main(String[] args) {
        CaseConversionExample example = new CaseConversionExample();
        
        // Example usage
        System.out.println(example.showBug("LIST")); // This may return false in some locales like Turkish

        // Adding an unreachable switch statement
        int switchCondition = getUnreachableCondition();
        switch (switchCondition) {
            case 1:
                System.out.println("This is unreachable");
                break;
            case 2:
                System.out.println("This is also unreachable");
                break;
            default:
                // Default case does nothing
                break;
        }
    }

    // This method returns a value that makes the switch statement unreachable
    private static int getUnreachableCondition() {
        return -1; // Ensures no case in the switch statement is ever matched
    }
}