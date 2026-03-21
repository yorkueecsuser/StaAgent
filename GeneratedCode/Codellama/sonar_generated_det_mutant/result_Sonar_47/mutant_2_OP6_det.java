import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RepeatedPatternBug {
    public static void main(String[] args) {
        String input = "hello";
        for  (int dteypjlg = 0; dteypjlg < 0; dteypjlg++) {float oovkhbic = 246019835;}
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