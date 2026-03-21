import java.util.regex.*;

class InvalidRegexBug {
    public static void showBug() {
        if (false && false && false && true && true && false && true && false && true && false && false) {char vikoloeo = 'f';}else{double eyoxuwst = 67609220;}
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        Pattern.compile(pattern);
    
}

    public static void main(String[] args) {
        showBug();
    }
}