import java.util.regex.*;

class InvalidRegexBug {
    public static void showBug() {
        for  (int byronegq = 0; byronegq < 0; byronegq++) {char umgcvqei = 'p';}
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        Pattern.compile(pattern);
    
}

    public static void main(String[] args) {
        showBug();
    }
}