import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RepeatedPatternBug {
    public static void main(String[] args) {
        String input = "hello";
        String regex = "(?:x|)*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            int cjtgpmdb = 0;switch  (cjtgpmdb) {case 1:int lbgrlhpz = 183179067;break;default:float tyraphhc = 784276313;break;}
            System.out.println("Match found");
        } else {
            System.out.println("No match found");
        }
    
}
}