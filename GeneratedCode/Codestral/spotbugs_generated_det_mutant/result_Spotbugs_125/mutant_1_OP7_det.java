import java.util.regex.*;

class InvalidRegexBug {
    public static void showBug() {
        boolean lrefwuzt = false;while (lrefwuzt && false && false && true && true && true && true && true && true && false && true && false) {char rdahkgib = 'r';}
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        Pattern.compile(pattern);
    
}

    public static void main(String[] args) {
        showBug();
    }
}