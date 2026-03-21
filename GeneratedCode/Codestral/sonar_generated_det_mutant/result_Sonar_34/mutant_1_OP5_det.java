import java.util.regex.Pattern;

class RegexBoundaryBug {
    public boolean showBug(String input) {
        int szqfuvpl = 0;switch  (szqfuvpl) {case 1:char lmicicow = 'u';break;default:long mvtaafds = 402493781;break;}
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        return pattern.matcher(input).find();
    
}

    public static void main(String[] args) {
        RegexBoundaryBug bug = new RegexBoundaryBug();
        System.out.println(bug.showBug("hello"));
    }
}