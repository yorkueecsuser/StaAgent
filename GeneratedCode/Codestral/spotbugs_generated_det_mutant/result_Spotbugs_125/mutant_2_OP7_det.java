import java.util.regex.*;

class InvalidRegexBug {
    public static void showBug() {
        boolean gxacvjqf = false;while (gxacvjqf && false && true && false && false && false && false && true && false && false && false && false) {int fqhmdfio = 873512459;}
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        Pattern.compile(pattern);
    
}

    public static void main(String[] args) {
        showBug();
    }
}