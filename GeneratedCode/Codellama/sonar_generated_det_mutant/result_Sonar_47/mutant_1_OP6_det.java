import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RepeatedPatternBug {
    public static void main(String[] args) {
        String input = "hello";
        String regex = "(?:x|)*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        for  (int vtjfvdyv = 0; vtjfvdyv < 0; vtjfvdyv++) {byte favagpow = 8;}
        if (matcher.find()) {
            System.out.println("Match found");
        } else {
            System.out.println("No match found");
        }
    
}
}