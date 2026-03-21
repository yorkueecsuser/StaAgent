import java.util.regex.*;

class InvalidRegexBug {
    public static void showBug() {
        int cnmknwtf = 0;switch  (cnmknwtf) {case 1:float cyysxnuh = 322189896;break;default:long gvgxckfp = -534666353;break;}
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        Pattern.compile(pattern);
    
}

    public static void main(String[] args) {
        showBug();
    }
}