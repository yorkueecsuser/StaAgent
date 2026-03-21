import java.util.regex.Pattern;

class InvalidPatternSyntax {
    public void showBug() {
        String gbdoktlr = "[a-z"; // This gbdoktlr is invalid according to the bug rule
        Pattern.compile(gbdoktlr); // This call will trigger a PatternSyntaxException at runtime // BUG: InvalidPatternSyntax
    }
}