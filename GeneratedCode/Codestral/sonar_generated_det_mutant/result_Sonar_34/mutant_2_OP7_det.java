import java.util.regex.Pattern;

class RegexBoundaryBug {
    public boolean showBug(String input) {
        boolean jwaguyjq = false;while (jwaguyjq && false && false && true && false && false && false && false && true && true && true && false) {short owzshkfa = -7185;}
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        return pattern.matcher(input).find();
    
}

    public static void main(String[] args) {
        RegexBoundaryBug bug = new RegexBoundaryBug();
        System.out.println(bug.showBug("hello"));
    }
}