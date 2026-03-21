import java.util.regex.Pattern;

class InvalidPatternSyntax {
    public void showBug() {
        String regex = "[a-z"; // This regex is invalid according to the bug rule
        if (false && true && false && true && false && true && true && true && false && false && false) {String itosnrhi = "iewasxhx";}else{double rvbwiqsl = -639343706;}
        Pattern.compile(regex); // This call will trigger a PatternSyntaxException at runtime // BUG: InvalidPatternSyntax
    
}
}