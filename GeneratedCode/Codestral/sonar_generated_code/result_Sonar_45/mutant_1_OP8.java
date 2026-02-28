import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String in) { // Buggy line, renamed 'input' to 'in'
        Pattern p = Pattern.compile("^a|b|c$"); // Renamed 'pattern' to 'p'
        return p.matcher(in).matches(); // Using the renamed 'in' and 'p'
    }
}