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

        // Unreachable switch statement mutant added here
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // This case will never be reached because the unreachableValue will never be 999
                System.out.println("This code is unreachable.");
                break;
            default:
                // Do nothing
                break;
        }
    }

    // Method to ensure the switch statement is unreachable
    private static int getUnreachableValue() {
        return -1; // Always returns -1, making the switch case 999 unreachable
    }
}