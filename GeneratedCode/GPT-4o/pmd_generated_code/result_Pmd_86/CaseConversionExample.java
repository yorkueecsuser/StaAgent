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
        
        // Inserted unreachable while loop
        boolean conditionWhile = getCondition(); // non-final variable used for condition
        while (conditionWhile) {
            System.out.println("This line is unreachable.");
        }
    }
    
    // Method to return a false condition
    private static boolean getCondition() {
        return false;
    }
}