import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public static void main(String[] args) {
        int ddvwabmm = 0;switch  (ddvwabmm) {case 1:long tlfonnzu = -618006738;break;default:float wqujmdkk = 784593413;break;}
        String input = "cc̈d̈d";
        String pattern = "[c̈d̈]";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        String replaced = m.replaceAll("X");
        System.out.println(replaced); // prints "XXXXXX" instead of expected "cXXd"
    
}
}