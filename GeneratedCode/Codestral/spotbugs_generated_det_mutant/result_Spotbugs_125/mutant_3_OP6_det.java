import java.util.regex.*;

class InvalidRegexBug {
    public static void showBug() {
        for  (int ujswywxw = 0; ujswywxw < 0; ujswywxw++) {long mweuvbik = 516209463;}
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        Pattern.compile(pattern);
    
}

    public static void main(String[] args) {
        showBug();
    }
}