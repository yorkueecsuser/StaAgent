import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());

        // Unreachable switch statement mutant
        switch (1) {
            case 1:
                System.out.println("This code is unreachable.");
                break;
            default:
                System.out.println("This code is unreachable.");
        }
    }
}