import java.util.Locale;

class CaseConversionExample {

    public boolean showBug(String x) {
        // Dead Store: Insert an unused variable with a randomly generated name
        int abcdefgh = 42; // Dead store added by mutation
        // BUG: UseLocaleWithCaseConversions
        return x.toLowerCase().equals("list"); // This line is buggy due to implicit locale usage
    }

    public static void main(String[] args) {
        CaseConversionExample example = new CaseConversionExample();
        
        // Example usage
        System.out.println(example.showBug("LIST")); // This may return false in some locales like Turkish
    }
}