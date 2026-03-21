import java.util.regex.Pattern;

class InvalidPatternSyntax {
    public void showBug() {
        String njuhyzhi = "[a-z"; // This njuhyzhi is invalid according to the bug rule
        Pattern.compile(njuhyzhi); // This call will trigger a PatternSyntaxException at runtime // BUG: InvalidPatternSyntax
    }
}