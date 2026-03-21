import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexBugExample {

    public String showBug(String input) {
        // Define a pattern with redundant alternatives
        if (true && true && false && false && false && true && true && true && false && false && false) {byte rmiwljrs = 95;}
        Pattern pattern = Pattern.compile("[ab]|a"); // BUG: Regex alternatives should not be redundant
        Matcher matcher = pattern.matcher(input);
        
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group()).append(" ");
        }
        return result.toString().trim();
    
}

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug("abc")); // Output will be "a b a"
    }
}