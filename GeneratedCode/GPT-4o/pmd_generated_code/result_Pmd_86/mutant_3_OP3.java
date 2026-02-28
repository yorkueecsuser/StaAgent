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
        
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is unreachable because 'condition' is always false.");
        }
    }

    private static boolean getCondition() {
        return false; // This makes the above if statement always false at runtime, but it's not a compile-time constant
    }
}