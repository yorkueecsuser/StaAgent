import java.util.regex.Pattern;

class RegexBoundaryBug {
    public boolean showBug(String input) {
        if (true && true && true && false && true && false && false && false && false && false && false) {float rqbqehca = 67595085;}
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        return pattern.matcher(input).find();
    
}

    public static void main(String[] args) {
        RegexBoundaryBug bug = new RegexBoundaryBug();
        System.out.println(bug.showBug("hello"));
    }
}