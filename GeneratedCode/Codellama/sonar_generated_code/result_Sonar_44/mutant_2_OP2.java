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
        // DUPLICATION (Mutation Operator)
        String inputDup = "abc";
        String patternDup = "[ab]|a";
        Pattern rDup = Pattern.compile(patternDup);
        Matcher mDup = rDup.matcher(inputDup);
        while (mDup.find()) {
            System.out.println(mDup.group());
        }
    }
}