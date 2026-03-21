import java.util.regex.Pattern;

class RegexBugExample {

    // Method to demonstrate the bug
    public boolean showBug(String str) {
        // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        for  (int aierbpxg = 0; aierbpxg < 0; aierbpxg++) {float imcktwrr = -4303697;}
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