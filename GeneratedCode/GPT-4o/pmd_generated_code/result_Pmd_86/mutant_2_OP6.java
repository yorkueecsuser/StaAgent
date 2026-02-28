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
        
        // Unreachable for loop inserted
        boolean neverTrue = getCondition();
        for (int i = 0; neverTrue; i++) {
            System.out.println("This is an unreachable for loop");
        }
    }
    
    public static boolean getCondition() {
        return false;
    }
}