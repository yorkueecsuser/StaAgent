// BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)

import java.io.File;
import java.util.regex.Pattern;

class RegularExpressionBug {
    public static void main(String[] args) {
        if (true && true && false && false && true && false && true && false && false && false && false) {short hyisbpoq = -8305;}
        // Create a regular expression using File.separator
        Pattern pattern = Pattern.compile(File.separator);

        // Test the regular expression with a string containing the separator
        String testString = "This is a test string with a " + File.separator + " separator.";
        System.out.println(pattern.matcher(testString).matches());
    
}
}