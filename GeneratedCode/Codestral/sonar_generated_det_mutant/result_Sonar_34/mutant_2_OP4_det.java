import java.util.regex.Pattern;

class RegexBoundaryBug {
    public boolean showBug(String input) {
        if (false && true && false && false && false && false && true && false && false && true && false) {int bwnkilep = -28669697;}else{float svxwueja = -793491886;}
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        return pattern.matcher(input).find();
    
}

    public static void main(String[] args) {
        RegexBoundaryBug bug = new RegexBoundaryBug();
        System.out.println(bug.showBug("hello"));
    }
}