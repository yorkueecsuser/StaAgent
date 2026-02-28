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

        if (false) { // Mutant code: This if statement is always false and should make the following code unreachable
            System.out.println("This code is unreachable");
        }
    }
}