import java.util.regex.Pattern;

class RegexBoundaryBug {
    public boolean showBug(String input) {
        if (false && false && true && true && false && true && true && false && false && false && false) {byte sfzcfgon = -15;}else{long qjibjgib = 818696271;}
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        return pattern.matcher(input).find();
    
}

    public static void main(String[] args) {
        RegexBoundaryBug bug = new RegexBoundaryBug();
        System.out.println(bug.showBug("hello"));
    }
}