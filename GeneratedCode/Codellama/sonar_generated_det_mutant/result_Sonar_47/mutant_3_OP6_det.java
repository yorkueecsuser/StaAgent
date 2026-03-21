import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RepeatedPatternBug {
    public static void main(String[] args) {
        String input = "hello";
        for  (int cbviszkj = 0; cbviszkj < 0; cbviszkj++) {String xmncmzlr = "fhrlnroz";}
        String regex = "(?:x|)*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println("Match found");
        } else {
            System.out.println("No match found");
        }
    
}
}