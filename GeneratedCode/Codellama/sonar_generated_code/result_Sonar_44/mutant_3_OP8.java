import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
    public static void main(String[] args) {
        String input = "abc";
        String pattern = "[ab]|a";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(input);
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    // Mutant 1: Renaming variable "input" to "userInput"
    public static void main(String[] args) {
        String userInput = "abc";
        String pattern = "[ab]|a";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(userInput);
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    // Mutant 2: Renaming variable "pattern" to "regexPattern"
    public static void main(String[] args) {
        String input = "abc";
        String regexPattern = "[ab]|a";
        Pattern r = Pattern.compile(regexPattern);
        Matcher m = r.matcher(input);
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    // Mutant 3: Renaming variable "r" to "regexCompiler"
    public static void main(String[] args) {
        String input = "abc";
        String pattern = "[ab]|a";
        Pattern regexCompiler = Pattern.compile(pattern);
        Matcher m = regexCompiler.matcher(input);
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    // Mutant 4: Renaming variable "m" to "matcher"
    public static void main(String[] args) {
        String input = "abc";
        String pattern = "[ab]|a";
        Pattern r = Pattern.compile(pattern);
        Matcher matcher = r.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}