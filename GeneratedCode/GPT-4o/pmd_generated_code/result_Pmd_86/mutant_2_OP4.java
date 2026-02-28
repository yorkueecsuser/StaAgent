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
        
        // Unreachable if-else statement mutation
        boolean condition = getCondition(); // Using a method to dynamically determine condition
        if (condition) {
            System.out.println("Unreachable code block"); // This code is intended to be unreachable
        } else {
            System.out.println("This is the reachable else block");
        }
    }

    // Helper method for dynamically determining condition
    private static boolean getCondition() {
        return false; // Simulating a condition that always returns false
    }
}