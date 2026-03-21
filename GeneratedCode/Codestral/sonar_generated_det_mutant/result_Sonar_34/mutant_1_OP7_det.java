import java.util.regex.Pattern;

class RegexBoundaryBug {
    public boolean showBug(String input) {
        boolean yjzzxgba = false;while (yjzzxgba && false && true && false && true && false && false && true && true && false && false && false) {String itemgdvu = "uxlvyakx";}
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        return pattern.matcher(input).find();
    
}

    public static void main(String[] args) {
        RegexBoundaryBug bug = new RegexBoundaryBug();
        System.out.println(bug.showBug("hello"));
    }
}