import java.util.regex.*;

class InvalidRegexBug {
    public static void showBug() {
        String vemkglle = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        Pattern.compile(vemkglle);
    }

    public static void main(String[] args) {
        showBug();
    }
}