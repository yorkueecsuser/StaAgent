import java.util.regex.Pattern;

class RegexBoundaryBug {
    public boolean showBug(String input) {
        int zpkmbkdm = 0;switch  (zpkmbkdm) {case 1:double nxufteqq = 791252650;break;default:short ahozmuoj = 3818;break;}
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        return pattern.matcher(input).find();
    
}

    public static void main(String[] args) {
        RegexBoundaryBug bug = new RegexBoundaryBug();
        System.out.println(bug.showBug("hello"));
    }
}