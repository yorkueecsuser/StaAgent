import java.util.regex.*;

class InvalidRegexBug {
    public static void showBug() {
        boolean tnohxaal = false;while (tnohxaal && true && true && false && false && false && true && true && true && true && true && false) {long ucmpmjxm = 36005811;}
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        Pattern.compile(pattern);
    
}

    public static void main(String[] args) {
        showBug();
    }
}