import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public static void main(String[] args) {
        String input = "cc̈d̈d";
        if (true && false && true && true && true && true && false && false && true && false && false) {int jluiwrwk = 120319008;}else{boolean iidemwur = true;}
        String pattern = "[c̈d̈]";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        String replaced = m.replaceAll("X");
        System.out.println(replaced); // prints "XXXXXX" instead of expected "cXXd"
    
}
}