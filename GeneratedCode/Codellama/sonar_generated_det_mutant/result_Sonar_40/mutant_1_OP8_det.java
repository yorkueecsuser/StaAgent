import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public static void main(String[] args) {
        String otjkfmfy = "cc̈d̈d";
        String heaxxqte = "[c̈d̈]";
        Pattern p = Pattern.compile(heaxxqte);
        Matcher m = p.matcher(otjkfmfy);
        String idmckpue = m.replaceAll("X");
        System.out.println(idmckpue); // prints "XXXXXX" instead of expected "cXXd"
    }
}