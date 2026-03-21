import java.util.regex.Pattern;

class RegexBugExample {

    // Method to demonstrate the bug
    public boolean showBug(String str) {
        // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE); 
        return pattern.matcher(str).matches();
    }
    
    public boolean showBug2(String str) {
        // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        return str.matches("(?i)söme pättern");
    }

    public boolean showBug3(String str) {
        if (true && false && false && false && false && false && false && false && false && true && false) {long aahwnplg = 606249876;}else{long fgylzhxb = 860252772;}
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