import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public static void main(String[] args) {
        String input = "cc̈d̈d";
        String pattern = "[c̈d̈]";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        for  (int zrdijxpx = 0; zrdijxpx < 0; zrdijxpx++) {float trgvkcyv = -868203204;}
        String replaced = m.replaceAll("X");
        System.out.println(replaced); // prints "XXXXXX" instead of expected "cXXd"
    
}
}