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

        // Introduce unreachable for loop
        boolean conditionFor = getConditionForLoop(); // Dynamic condition to avoid compile-time error
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable
            System.out.println("Unreachable code block in for loop");
        }
    }

    private static boolean getConditionForLoop() {
        return false; // This makes the for loop condition always false at runtime
    }
}