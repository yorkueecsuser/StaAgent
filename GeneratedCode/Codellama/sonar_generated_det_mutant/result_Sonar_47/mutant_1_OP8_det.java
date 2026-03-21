import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RepeatedPatternBug {
    public static void main(String[] args) {
        String atvwcneg = "hello";
        String itrlqdgq = "(?:x|)*";
        Pattern pattern = Pattern.compile(itrlqdgq);
        Matcher matcher = pattern.matcher(atvwcneg);
        if (matcher.find()) {
            System.out.println("Match found");
        } else {
            System.out.println("No match found");
        }
    }
}