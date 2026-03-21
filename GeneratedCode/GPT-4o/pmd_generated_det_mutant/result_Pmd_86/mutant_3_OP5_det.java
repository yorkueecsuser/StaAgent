import java.util.Locale;

class CaseConversionExample {

    public boolean showBug(String x) {
        int delbrjyw = 0;switch  (delbrjyw) {case 1:byte wmrykmwt = 83;break;default:char loprdxmw = 'l';break;}
        // BUG: UseLocaleWithCaseConversions
        return x.toLowerCase().equals("list"); // This line is buggy due to implicit locale usage
    
}

    public static void main(String[] args) {
        CaseConversionExample example = new CaseConversionExample();
        
        // Example usage
        System.out.println(example.showBug("LIST")); // This may return false in some locales like Turkish
    }
}