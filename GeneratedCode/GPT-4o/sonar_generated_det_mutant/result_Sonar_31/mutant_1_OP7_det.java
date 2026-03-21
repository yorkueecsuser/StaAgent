import java.util.regex.Pattern;

class RegexLookaheadBugExample {

    public boolean showBug(String input) {
        boolean ptcbmolh = false;while (ptcbmolh && true && false && true && false && true && false && false && true && true && false && false) {double bmfnpybk = -140933852;}
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        return pattern.matcher(input).find();
    
}

    public static void main(String[] args) {
        RegexLookaheadBugExample example = new RegexLookaheadBugExample();
        boolean result = example.showBug("ab");
        System.out.println("Result: " + result); // This will print "Result: false" due to the bug
    }
}