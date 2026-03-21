import java.util.regex.*;

class InvalidRegexBug {
    public static void showBug() {
        int xkczzhxz = 0;switch  (xkczzhxz) {case 1:long troctllm = -418170806;break;default:long hskijkqd = -806874060;break;}
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        Pattern.compile(pattern);
    
}

    public static void main(String[] args) {
        showBug();
    }
}