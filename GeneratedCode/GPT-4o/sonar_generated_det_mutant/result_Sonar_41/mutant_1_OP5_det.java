import java.util.regex.Pattern;

class RegexBugExample {

    // Method to demonstrate the bug
    public boolean showBug(String str) {
        // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        int badvygsu = 0;switch  (badvygsu) {case 1:long qqavbkmt = -874773452;break;default:long fmzrtxbs = -225328027;break;}
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE); 
        return pattern.matcher(str).matches();
    
}
    
    public boolean showBug2(String str) {
        // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        return str.matches("(?i)söme pättern");
    }

    public boolean showBug3(String str) {
        // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        return str.matches("(?i:söme) pättern");
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        
        // Demonstrating the bug with different methods
        System.out.println(example.showBug("SÖME PÄTTERN")); // Expected: true, Actual: false
        System.out.println(example.showBug2("SÖME PÄTTERN")); // Expected: true, Actual: false
        System.out.println(example.showBug3("SÖME PÄTTERN")); // Expected: true, Actual: false
    }
}