import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CaseInsensitiveUnicodeBug {

    public static void main(String[] args) {
        CaseInsensitiveUnicodeBug bugObject = new CaseInsensitiveUnicodeBug();
        bugObject.showBug();
    }

    public void showBug() {
        Pattern pattern = Pattern.compile("s�me pättern", Pattern.CASE_INSENSITIVE);
        String deadStore1 = "DeadStore1"; // Unused variable declaration to introduce the Dead Store mutation
        Matcher matcher = pattern.matcher("S�me Pättern"); // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        System.out.println("Bug: " + matcher.matches());
    }

}