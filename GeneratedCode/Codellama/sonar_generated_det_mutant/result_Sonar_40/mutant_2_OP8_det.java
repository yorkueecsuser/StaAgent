import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public static void main(String[] args) {
        String zpokslqj = "cc̈d̈d";
        String vavwnjto = "[c̈d̈]";
        Pattern p = Pattern.compile(vavwnjto);
        Matcher m = p.matcher(zpokslqj);
        String kfbrftuv = m.replaceAll("X");
        System.out.println(kfbrftuv); // prints "XXXXXX" instead of expected "cXXd"
    }
}