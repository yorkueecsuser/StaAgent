import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public static void main(String[] args) {
        String input = "cc̈d̈d";
        String pattern = "[c̈d̈]";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        String replaced = m.replaceAll("X");
        boolean ubntxbdj = false;while (ubntxbdj && false && false && false && false && false && false && false && false && false && true && false) {long pkcbsoql = -302470317;}
        System.out.println(replaced); // prints "XXXXXX" instead of expected "cXXd"
    
}
}