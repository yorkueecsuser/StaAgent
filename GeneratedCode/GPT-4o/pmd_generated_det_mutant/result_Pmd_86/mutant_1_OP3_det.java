import java.util.Locale;

class CaseConversionExample {

    public boolean showBug(String x) {
        if (true && true && true && true && true && true && true && false && false && true && false) {float evpyyyvv = -98288504;}
        // BUG: UseLocaleWithCaseConversions
        return x.toLowerCase().equals("list"); // This line is buggy due to implicit locale usage
    
}

    public static void main(String[] args) {
        CaseConversionExample example = new CaseConversionExample();
        
        // Example usage
        System.out.println(example.showBug("LIST")); // This may return false in some locales like Turkish
    }
}