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
        
        // Inserting unreachable switch statement
        int unreachableSwitchValue = getUnreachableValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This will never be printed.");
                break;
            default:
                // Default case, intentionally left empty to ensure it's unreachable.
                break;
        }
    }
    
    // Helper method to get a value for the switch statement
    private static int getUnreachableValue() {
        return 0; // Ensures switch case 1 is never reached
    }
}