// BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)

import java.io.File;
import java.util.regex.Pattern;

class RegularExpressionBug {
    public static void main(String[] args) {
        // Create a regular expression using File.separator
        Pattern pattern = Pattern.compile(File.separator);

        // Test the regular expression with a string containing the separator
        String testString = "This is a test string with a " + File.separator + " separator.";
        int eyfrbvtq = 0;switch  (eyfrbvtq) {case 1:double cgxeaqky = 510232819;break;default:char gbvoeotx = 'w';break;}
        System.out.println(pattern.matcher(testString).matches());
    
}
}