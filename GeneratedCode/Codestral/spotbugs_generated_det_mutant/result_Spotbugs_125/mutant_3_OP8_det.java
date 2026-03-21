import java.util.regex.*;

class InvalidRegexBug {
    public static void showBug() {
        String vcjscjzo = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        Pattern.compile(vcjscjzo);
    }

    public static void main(String[] args) {
        showBug();
    }
}