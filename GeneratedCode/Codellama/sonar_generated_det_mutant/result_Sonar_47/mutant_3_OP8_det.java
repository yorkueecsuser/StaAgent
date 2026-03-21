import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RepeatedPatternBug {
    public static void main(String[] args) {
        String uxupdxzk = "hello";
        String ypwoniak = "(?:x|)*";
        Pattern pattern = Pattern.compile(ypwoniak);
        Matcher matcher = pattern.matcher(uxupdxzk);
        if (matcher.find()) {
            System.out.println("Match found");
        } else {
            System.out.println("No match found");
        }
    }
}