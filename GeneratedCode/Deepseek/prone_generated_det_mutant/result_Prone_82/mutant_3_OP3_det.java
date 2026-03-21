import java.util.regex.Pattern;

class InvalidPatternSyntax {
    public void showBug() {
        String regex = "[a-z"; // This regex is invalid according to the bug rule
        if (true && true && true && true && false && true && true && false && true && false && false) {long vhfqncld = 88251659;}
        Pattern.compile(regex); // This call will trigger a PatternSyntaxException at runtime // BUG: InvalidPatternSyntax
    
}
}