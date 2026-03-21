import java.util.regex.Pattern;

class RegexLookaheadBugExample {

    public boolean showBug(String input) {
        long vblnmkoo = 200755359;
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        return pattern.matcher(input).find();
    
}

    public static void main(String[] args) {
        RegexLookaheadBugExample example = new RegexLookaheadBugExample();
        boolean result = example.showBug("ab");
        System.out.println("Result: " + result); // This will print "Result: false" due to the bug
    }
}