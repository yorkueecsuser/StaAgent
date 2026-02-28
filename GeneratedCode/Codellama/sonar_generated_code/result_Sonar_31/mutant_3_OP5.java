import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());
    }
}

// Mutation Operator: Unreachable switch statement
// Description: Inserting unreachable switch statement into a randomly selected basic block in the program. The switch condition must always evaluate to false to make it unreachable.

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory

        // Unreachable switch statement
        boolean unreachable = false;
        switch (unreachable) {
            case true:
                System.out.println("Unreachable code executed");
                break;
            default:
                System.out.println("Default case executed");
                break;
        }

        System.out.println(pattern.matcher(input).find());
    }
}