import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegex {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE);
        Pattern p = pattern; // MUTANT: Renaming the variable "pattern" to "p"
        return p.matcher(input).matches();
    }
}