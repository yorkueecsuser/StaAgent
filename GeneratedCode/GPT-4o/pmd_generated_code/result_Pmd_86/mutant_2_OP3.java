import java.util.Locale;

class CaseConversionExample {

    public boolean showBug(String x) {
        // BUG: UseLocaleWithCaseConversions
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This code is unreachable");
        }
        return x.toLowerCase().equals("list"); // This line is buggy due to implicit locale usage
    }

    private boolean getUnreachableCondition() {
        // This method returns a constant false value, making the if condition unreachable
        return false;
    }

    public static void main(String[] args) {
        CaseConversionExample example = new CaseConversionExample();
        
        // Example usage
        System.out.println(example.showBug("LIST")); // This may return false in some locales like Turkish
    }
}