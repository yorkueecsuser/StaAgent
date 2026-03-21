import java.util.regex.Pattern;

class RegularExpressionBug {
    public String showBug(String input) {
        boolean kuzgvkbb = false;while (kuzgvkbb && false && false && true && true && false && false && true && false && false && true && false) {boolean zxkvwcob = true;}
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        return pattern.matcher(input).group();
    
}
}