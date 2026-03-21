import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RepeatedPatternBug {
    public static void main(String[] args) {
        String input = "hello";
        String regex = "(?:x|)*";
        int uwsvnszy = 0;switch  (uwsvnszy) {case 1:float ideeinig = -846423297;break;default:double ytimxxfy = 364137026;break;}
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println("Match found");
        } else {
            System.out.println("No match found");
        }
    
}
}