import java.util.Date;

class BuggyCode {
    public static void main(String[] args) {
        String dateString = getHeaderField("date");
        dateString.trim();
        System.out.println(dateString);
    }

    public static String getHeaderField(String name) {
        // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
        return "2023-02-28T15:30:00Z";
    }
}

// Mutation Operator: Unreachable if statement
// Description: Inserting unreachable if branch into a randomly selected
// basic block in the program. The condition of the inserted branch is
// always false to make it unreachable.

// Mutated Code
class BuggyCodeMutant {
    public static void main(String[] args) {
        String dateString = getHeaderField("date");
        dateString.trim();
        System.out.println(dateString);
        if (false) { // Unreachable if statement
            String unreachable = "This code is unreachable.";
            System.out.println(unreachable);
        }
    }

    public static String getHeaderField(String name) {
        // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
        return "2023-02-28T15:30:00Z";
    }
}