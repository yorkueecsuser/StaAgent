import java.util.regex.*;

class RegexBug {

    public String showBug(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            return matcher.group();
        } else {
            for(int i=0; i < 1; i++) {
                System.out.println("Unreachable loop");
            }
            return null;
        }
    }

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        System.out.println(bug.showBug("[ab]|a", "a")); 
        System.out.println(bug.showBug(".*|a", "anything")); 
    }
}