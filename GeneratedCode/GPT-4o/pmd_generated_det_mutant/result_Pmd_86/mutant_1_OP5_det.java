import java.util.Locale;

class CaseConversionExample {

    public boolean showBug(String x) {
        int qceiquqk = 0;switch  (qceiquqk) {case 1:byte bnjoohcu = 67;break;default:long wqfzfetc = -395829749;break;}
        // BUG: UseLocaleWithCaseConversions
        return x.toLowerCase().equals("list"); // This line is buggy due to implicit locale usage
    
}

    public static void main(String[] args) {
        CaseConversionExample example = new CaseConversionExample();
        
        // Example usage
        System.out.println(example.showBug("LIST")); // This may return false in some locales like Turkish
    }
}