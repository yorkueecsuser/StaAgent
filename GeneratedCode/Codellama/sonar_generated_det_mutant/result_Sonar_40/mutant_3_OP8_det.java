import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public static void main(String[] args) {
        String capyqutw = "cc̈d̈d";
        String hlucanbh = "[c̈d̈]";
        Pattern p = Pattern.compile(hlucanbh);
        Matcher m = p.matcher(capyqutw);
        String xqvvknaj = m.replaceAll("X");
        System.out.println(xqvvknaj); // prints "XXXXXX" instead of expected "cXXd"
    }
}