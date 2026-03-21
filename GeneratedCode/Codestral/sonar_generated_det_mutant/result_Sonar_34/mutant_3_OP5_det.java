import java.util.regex.Pattern;

class RegexBoundaryBug {
    public boolean showBug(String input) {
        int wjsrbpmw = 0;switch  (wjsrbpmw) {case 1:char ctxndzzr = 'f';break;default:float nvmsvjki = -5484186;break;}
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        return pattern.matcher(input).find();
    
}

    public static void main(String[] args) {
        RegexBoundaryBug bug = new RegexBoundaryBug();
        System.out.println(bug.showBug("hello"));
    }
}