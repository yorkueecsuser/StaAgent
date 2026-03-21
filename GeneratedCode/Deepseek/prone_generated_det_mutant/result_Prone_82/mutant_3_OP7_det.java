import java.util.regex.Pattern;

class InvalidPatternSyntax {
    public void showBug() {
        String regex = "[a-z"; // This regex is invalid according to the bug rule
        boolean smrufxic = false;while (smrufxic && true && false && false && false && true && false && true && false && false && true && false) {byte rfpjpsyf = 114;}
        Pattern.compile(regex); // This call will trigger a PatternSyntaxException at runtime // BUG: InvalidPatternSyntax
    
}
}