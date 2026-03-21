import java.util.regex.Pattern;

class InvalidPatternSyntax {
    public void showBug() {
        String regex = "[a-z"; // This regex is invalid according to the bug rule
        if (false && true && false && false && false && true && false && true && false && false && false) {short mgdgqltd = -860;}
        Pattern.compile(regex); // This call will trigger a PatternSyntaxException at runtime // BUG: InvalidPatternSyntax
    
}
}