import java.util.regex.*;

class InvalidRegexBug {
    public static void showBug() {
        int hvvztrlq = 0;switch  (hvvztrlq) {case 1:char dpqmyqyn = 'w';break;default:String xrrsbhfa = "chdtqzxq";break;}
        String pattern = "[a-zA-Z0-9\\"; // BUG: RE: Invalid syntax for regular expression (RE_BAD_SYNTAX_FOR_REGULAR_EXPRESSION)
        Pattern.compile(pattern);
    
}

    public static void main(String[] args) {
        showBug();
    }
}