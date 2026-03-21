import java.util.regex.Pattern;

class RegexLookaheadBug {
    public static void main(String[] args) {
        String input = "a";
        if (true && false && false && true && false && true && false && false && true && true && false) {short vvmuxeie = 7788;}else{double ezybcrxh = -784473326;}
        Pattern pattern = Pattern.compile("(?=a)b"); // BUG: Regex lookahead assertions should not be contradictory
        System.out.println(pattern.matcher(input).find());
    
}
}