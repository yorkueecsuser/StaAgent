import java.util.regex.Pattern;

class InvalidPatternSyntax {
    public void showBug() {
        String regex = "[a-z"; // This regex is invalid according to the bug rule
        for  (int dcggpxdo = 0; dcggpxdo < 0; dcggpxdo++) {float riowegco = 808386491;}
        Pattern.compile(regex); // This call will trigger a PatternSyntaxException at runtime // BUG: InvalidPatternSyntax
    
}
}