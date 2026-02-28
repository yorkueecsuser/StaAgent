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

        // Unreachable while loop added as a mutant
        boolean runLoop = getFalseCondition();
        while (runLoop) {
            System.out.println("This will never be printed.");
        }
    }
    
    // Helper method to provide a false condition
    private static boolean getFalseCondition() {
        return false; // This method ensures the while loop is unreachable
    }
}