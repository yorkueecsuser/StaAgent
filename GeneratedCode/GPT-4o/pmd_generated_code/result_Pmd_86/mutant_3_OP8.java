import java.util.Locale;

class CaseConversionExample {

    public boolean showBug(String x) {
        // BUG: UseLocaleWithCaseConversions
        return x.toLowerCase().equals("list"); // This line is buggy due to implicit locale usage
    }

    public boolean showBugWithRenamedVariable(String y) {
        // BUG: UseLocaleWithCaseConversions
        return y.toLowerCase().equals("list"); // This line is buggy due to implicit locale usage
    }

    public static void main(String[] args) {
        CaseConversionExample example = new CaseConversionExample();
        
        // Example usage
        System.out.println(example.showBug("LIST")); // This may return false in some locales like Turkish
        System.out.println(example.showBugWithRenamedVariable("LIST")); // This may also return false in some locales like Turkish
    }
}