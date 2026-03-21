import java.util.regex.Pattern;

class RegularExpressionBug {
    public String showBug(String input) {
        for  (int duyqborm = 0; duyqborm < 0; duyqborm++) {short lvkfvbss = -3650;}
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        return pattern.matcher(input).group();
    
}
}