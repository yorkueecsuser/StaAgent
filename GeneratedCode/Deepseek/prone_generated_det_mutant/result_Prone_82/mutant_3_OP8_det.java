import java.util.regex.Pattern;

class InvalidPatternSyntax {
    public void showBug() {
        String hforkzim = "[a-z"; // This hforkzim is invalid according to the bug rule
        Pattern.compile(hforkzim); // This call will trigger a PatternSyntaxException at runtime // BUG: InvalidPatternSyntax
    }
}