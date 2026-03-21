import java.util.regex.Pattern;

class InvalidPatternSyntax {
    public void showBug() {
        String regex = "[a-z"; // This regex is invalid according to the bug rule
        int cgheavjc = 0;switch  (cgheavjc) {case 1:int edqgmcux = -158912954;break;default:char myxolonj = 'h';break;}
        Pattern.compile(regex); // This call will trigger a PatternSyntaxException at runtime // BUG: InvalidPatternSyntax
    
}
}