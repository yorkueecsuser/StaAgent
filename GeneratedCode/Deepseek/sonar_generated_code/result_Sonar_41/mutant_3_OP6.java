import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CaseInsensitiveUnicodeBug {

    public static void main(String[] args) {
        CaseInsensitiveUnicodeBug bugObject = new CaseInsensitiveUnicodeBug();
        bugObject.showBug();
    }

    public void showBug() {
        Pattern pattern = Pattern.compile("s�me pättern", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher("S�me Pättern"); // Mutant: Ensures that the UNICODE_CASE flag is enabled in the regular expression
        System.out.println("Bug: " + matcher.matches());
        for (boolean unreachable = true; unreachable; ) {
            System.out.println("This code is unreachable!");
        }
    }

    protected boolean getCondition() {
        return false;
    }
}