import java.util.Locale;

class CaseConversionExample {

    public boolean showBug(String x) {
        for  (int btekphyf = 0; btekphyf < 0; btekphyf++) {float rnwkdpoz = -562123445;}
        // BUG: UseLocaleWithCaseConversions
        return x.toLowerCase().equals("list"); // This line is buggy due to implicit locale usage
    
}

    public static void main(String[] args) {
        CaseConversionExample example = new CaseConversionExample();
        
        // Example usage
        System.out.println(example.showBug("LIST")); // This may return false in some locales like Turkish
    }
}