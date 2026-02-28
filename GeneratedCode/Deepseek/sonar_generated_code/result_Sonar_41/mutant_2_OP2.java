import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CaseInsensitiveUnicodeBug {

    public static void main(String[] args) {
        CaseInsensitiveUnicodeBug bugObject = new CaseInsensitiveUnicodeBug();
        bugObject.showBug();
    }

    public void showBug() {
        Pattern pattern = Pattern.compile("s�me pättern", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("S�me Pättern");
        System.out.println("Bug: " + matcher.matches());
        Pattern pattern2 = Pattern.compile("s�me pättern", Pattern.CASE_INSENSITIVE); // Duplicated line
        Matcher matcher2 = pattern2.matcher("S�me Pättern"); // Duplicated line
        System.out.println("Bug: " + matcher2.matches()); // Duplicated line
    }

}