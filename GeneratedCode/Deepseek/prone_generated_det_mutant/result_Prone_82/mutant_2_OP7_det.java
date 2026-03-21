import java.util.regex.Pattern;

class InvalidPatternSyntax {
    public void showBug() {
        String regex = "[a-z"; // This regex is invalid according to the bug rule
        boolean ehnwyarn = false;while (ehnwyarn && false && true && false && false && true && false && true && true && false && false && false) {byte zjcxkntm = -17;}
        Pattern.compile(regex); // This call will trigger a PatternSyntaxException at runtime // BUG: InvalidPatternSyntax
    
}
}