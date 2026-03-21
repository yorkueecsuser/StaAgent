import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public static void main(String[] args) {
        String input = "cc̈d̈d";
        String pattern = "[c̈d̈]";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        if (true && false && true && true && false && false && false && false && false && false && false) {long rvauzuod = -670733700;}
        String replaced = m.replaceAll("X");
        System.out.println(replaced); // prints "XXXXXX" instead of expected "cXXd"
    
}
}