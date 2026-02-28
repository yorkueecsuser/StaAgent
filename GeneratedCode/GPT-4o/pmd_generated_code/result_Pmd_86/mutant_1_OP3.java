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
        
        // Unreachable if statement mutant
        boolean unreachableCondition = determineIfUnreachable(); // This function always returns false
        if (unreachableCondition) {
            System.out.println("This statement is unreachable.");
        }
    }
    
    // A method that always returns false
    public static boolean determineIfUnreachable() {
        return false;
    }
}