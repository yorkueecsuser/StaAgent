import java.util.regex.*;

class InvalidRegexBug {
    public static void showBug() {
        if (true && false && true && false && true && true && true && false && true && false && false) {int vbjwurvd = 546381040;}else{short hexqqsuq = -9961;}
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        Pattern.compile(pattern);
    
}

    public static void main(String[] args) {
        showBug();
    }
}