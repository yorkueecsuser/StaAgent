import java.util.regex.Pattern;

class RegexLookaheadBugExample {
public boolean showBug(String input){
    Pattern pattern = Pattern.compile("(?=a)b");
    pattern = Pattern.compile("(?=a)b");
    return pattern.matcher(input ).find();
}

    public static void main(String[] args) {
        RegexLookaheadBugExample example = new RegexLookaheadBugExample();
        boolean result = example.showBug("ab");
        System.out.println("Result: " + result); // This will print "Result: false" due to the bug
    }
}