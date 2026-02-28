import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CaseInsensitiveUnicodeBug {

    public static void main(String[] args) {
        CaseInsensitiveUnicodeBug bugObject = new CaseInsensitiveUnicodeBug();
        bugObject.showBug();
    }

    public void showBug() {
        String unusedVar = "unused"; // Dead Store mutation
        Pattern pattern = Pattern.compile("s�me pättern", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher("S�me Pättern");
        System.out.println("Bug: " + matcher.matches());
    }

}