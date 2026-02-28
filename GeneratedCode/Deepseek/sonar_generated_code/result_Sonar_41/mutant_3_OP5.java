import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CaseInsensitiveUnicodeBug {

    public static void main(String[] args) {
        CaseInsensitiveUnicodeBug bugObject = new CaseInsensitiveUnicodeBug();
        bugObject.showBug();
    }

    public void showBug() {
        Pattern pattern = Pattern.compile("s�me pättern", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE); // Mutant: Adding "Pattern.UNICODE_CASE" flag to enable unicode case insensitivity
        Matcher matcher = pattern.matcher("S�me Pättern"); 
        System.out.println("Bug: " + matcher.matches());

        // Unreachable switch statement mutant 
        int mutant = 1;
        switch (mutant) {
            case 0:
                System.out.println("This is an unreachable mutant");
                break;
            default:
                break;
        }
    }
}