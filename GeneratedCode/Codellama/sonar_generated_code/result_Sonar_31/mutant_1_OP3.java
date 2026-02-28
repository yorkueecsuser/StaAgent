import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        boolean condition = getCondition();
        if (condition) {
            Pattern pattern = Pattern.compile("(?=a)b");
            System.out.println(pattern.matcher(input).find());
        } else {
            // do nothing
        }
    }
}