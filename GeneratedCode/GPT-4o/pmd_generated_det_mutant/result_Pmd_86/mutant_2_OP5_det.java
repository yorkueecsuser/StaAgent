import java.util.Locale;

class CaseConversionExample {

    public boolean showBug(String x) {
        int kmbzbehq = 0;switch  (kmbzbehq) {case 1:long jtwddekw = 408982630;break;default:short ekayjfwd = 6031;break;}
        // BUG: UseLocaleWithCaseConversions
        return x.toLowerCase().equals("list"); // This line is buggy due to implicit locale usage
    
}

    public static void main(String[] args) {
        CaseConversionExample example = new CaseConversionExample();
        
        // Example usage
        System.out.println(example.showBug("LIST")); // This may return false in some locales like Turkish
    }
}