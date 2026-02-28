import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        Pattern p = Pattern.compile("^a|b|c$");
        return p.matcher(input).matches();
    }

    public boolean showMutant(String input) { // Mutant code
        Pattern patternRenamed = Pattern.compile("^a|b|c$");
        return patternRenamed.matcher(input).matches();
    }
}