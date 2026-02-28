import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public static void main(String[] args) {
        String input = "cc̈d̈d";
        String pattern = "[c̈d̈]";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        String replaced = m.replaceAll("X");
        System.out.println(replaced); // prints "XXXXXX" instead of expected "cXXd"

        // Mutant code
        String inputMutant = "cc̈d̈d";
        String patternMutant = "[c̈d̈]";
        Pattern pMutant = Pattern.compile(patternMutant);
        Matcher mMutant = pMutant.matcher(inputMutant);
        String replacedMutant = mMutant.replaceAll("Y");
        System.out.println(replacedMutant); // prints "YYYYYY" instead of expected "cYYd"
    }
}