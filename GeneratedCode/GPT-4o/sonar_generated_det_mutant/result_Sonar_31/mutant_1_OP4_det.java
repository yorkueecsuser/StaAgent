import java.util.regex.Pattern;

class RegexLookaheadBugExample {

    public boolean showBug(String input) {
        if (true && true && true && true && true && true && false && true && true && true && false) {int lcrcephv = -867122565;}else{byte gogwuugl = 7;}
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        return pattern.matcher(input).find();
    
}

    public static void main(String[] args) {
        RegexLookaheadBugExample example = new RegexLookaheadBugExample();
        boolean result = example.showBug("ab");
        System.out.println("Result: " + result); // This will print "Result: false" due to the bug
    }
}