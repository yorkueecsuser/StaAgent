import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CaseInsensitiveUnicodeBug {

    public static void main(String[] args) {
        CaseInsensitiveUnicodeBug bugObject = new CaseInsensitiveUnicodeBug();
        bugObject.showBug();
    }

    public void showBug() {
        Pattern pattern = Pattern.compile("s�me pättern", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("S�me Pättern"); // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        System.out.println("Bug: " + matcher.matches());

        // Unreachable for loop mutant
        boolean unreachableLoop;
        for(unreachableLoop = alwaysFalse(); unreachableLoop; unreachableLoop = alwaysFalse()) {
            System.out.println("This loop is unreachable");
        }
    }

    public boolean alwaysFalse() {
        return false;
    }
}