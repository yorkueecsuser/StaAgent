import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CaseInsensitiveUnicodeBug {

    public static void main(String[] args) {
        CaseInsensitiveUnicodeBug bugObject = new CaseInsensitiveUnicodeBug();
        bugObject.showBug();
    }

    public void showBug() {
        Pattern pattern = Pattern.compile("s�me pättern", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("S�me Pättern"); // Original line
        System.out.println("Original: " + matcher.matches()); // This line is added to make the control flow unreachable
        if (false) { // Mutation: Unreachable if statement
            System.out.println("Mutant: " + matcher.matches()); // This line is unreachable due to the false condition in the previous line
        }
    }

}