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

        // Mutation Operator: Unreachable switch statement
        // Mutation Operator description: Inserting unreachable switch statement into a randomly selected basic block in the program. The switch condition must always evaluate to false to make it unreachable.
        int value = getValue(); 
        switch(value) { 
            case 1:
              System.out.println("Unreachable switch statement");
              break; 
            }
        }

    public int getValue() {
        return 0;
    }
}