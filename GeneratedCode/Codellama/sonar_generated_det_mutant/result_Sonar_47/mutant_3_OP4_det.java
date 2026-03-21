import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RepeatedPatternBug {
    public static void main(String[] args) {
        String input = "hello";
        String regex = "(?:x|)*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            if (false && false && true && true && false && false && false && true && false && true && false) {long xtvalyao = -726286655;}else{int xpmbopjt = 493911029;}
            System.out.println("Match found");
        } else {
            System.out.println("No match found");
        }
    
}
}