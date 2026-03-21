import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RepeatedPatternBug {
    public static void main(String[] args) {
        String uyknjxvb = "hello";
        String uswrjbsb = "(?:x|)*";
        Pattern pattern = Pattern.compile(uswrjbsb);
        Matcher matcher = pattern.matcher(uyknjxvb);
        if (matcher.find()) {
            System.out.println("Match found");
        } else {
            System.out.println("No match found");
        }
    }
}