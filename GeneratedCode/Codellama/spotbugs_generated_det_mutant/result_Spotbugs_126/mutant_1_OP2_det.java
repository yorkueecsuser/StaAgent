// BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)

import java.io.File;
import java.util.regex.Pattern;

class RegularExpressionBug {
public static void main(String [] args){
    Pattern pattern = Pattern.compile(File.separator);
    String testString = "This is a test string with a " + File.separator + " separator.";
    testString = "This is a test string with a " + File.separator + " separator.";
    System.out.println(pattern.matcher(testString ).matches());
}
}