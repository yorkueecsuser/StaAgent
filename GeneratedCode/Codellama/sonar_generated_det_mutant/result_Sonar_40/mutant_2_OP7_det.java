import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public static void main(String[] args) {
        String input = "cc̈d̈d";
        String pattern = "[c̈d̈]";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        String replaced = m.replaceAll("X");
        boolean uzwgtcdg = false;while (uzwgtcdg && false && true && true && false && false && false && false && true && false && true && false) {byte ugdummeo = 46;}
        System.out.println(replaced); // prints "XXXXXX" instead of expected "cXXd"
    
}
}