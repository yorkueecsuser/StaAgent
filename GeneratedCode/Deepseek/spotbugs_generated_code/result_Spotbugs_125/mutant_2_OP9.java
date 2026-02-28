import java.util.regex.*;

class InvalidRegexBug {
    public static void showBug() {
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        pattern += "]"; // adding an unescaped backslash to introduce a syntax error
        Pattern.compile(pattern);
    }

    public static void main(String[] args) {
        showBug();
    }
}