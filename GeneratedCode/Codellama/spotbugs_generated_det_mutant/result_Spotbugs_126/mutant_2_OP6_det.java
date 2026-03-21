// BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)

import java.io.File;
import java.util.regex.Pattern;

class RegularExpressionBug {
    public static void main(String[] args) {
        for  (int bjkqskau = 0; bjkqskau < 0; bjkqskau++) {double ydjwkzrj = -724269766;}
        // Create a regular expression using File.separator
        Pattern pattern = Pattern.compile(File.separator);

        // Test the regular expression with a string containing the separator
        String testString = "This is a test string with a " + File.separator + " separator.";
        System.out.println(pattern.matcher(testString).matches());
    
}
}