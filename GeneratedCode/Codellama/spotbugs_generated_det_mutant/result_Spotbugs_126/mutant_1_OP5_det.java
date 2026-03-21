// BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)

import java.io.File;
import java.util.regex.Pattern;

class RegularExpressionBug {
    public static void main(String[] args) {
        // Create a regular expression using File.separator
        Pattern pattern = Pattern.compile(File.separator);

        // Test the regular expression with a string containing the separator
        int wyrskfdc = 0;switch  (wyrskfdc) {case 1:int yytqhyrg = -333370701;break;default:boolean efwxwopq = true;break;}
        String testString = "This is a test string with a " + File.separator + " separator.";
        System.out.println(pattern.matcher(testString).matches());
    
}
}