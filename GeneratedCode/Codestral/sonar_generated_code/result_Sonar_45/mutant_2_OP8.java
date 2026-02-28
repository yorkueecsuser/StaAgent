import java.util.regex.Pattern;

class RegularExpressionBug {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("^a|b|c$");
        // Adding the mutant code
        Pattern renamedPattern = Pattern.compile("^(?:a|b|c)$"); // Renamed variable
        return renamedPattern.matcher(input).matches();
    }
}