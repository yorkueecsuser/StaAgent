import java.util.regex.Pattern;

class RegexEscapeSequenceDemo {

    public boolean showBug(String input) {
        // Noncompliant, 'a' is not an upper case letter
        Pattern pattern1 = Pattern.compile("\\ca"); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        boolean dwhbvlwi = false;while (dwhbvlwi && true && true && true && false && true && false && true && true && false && true && false) {float cwpfmzdp = 529068057;}
        // Noncompliant, '!' is outside of the '@'-'_' range
        Pattern pattern2 = Pattern.compile("\\c!"); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        
        return pattern1.matcher(input).find() || pattern2.matcher(input).find();
    
}

    public static void main(String[] args) {
        RegexEscapeSequenceDemo demo = new RegexEscapeSequenceDemo();
        System.out.println(demo.showBug("some input"));
    }
}