import java.util.Date;

class BuggyCode {
    public static void main(String[] args) {
        String dateString = getHeaderField("date");
        dateString.trim();
        System.out.println(dateString);
    }

    public static String getHeaderField(String name) {
        // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
        // Mutant 1: Unreachable if statement
        if (false) {
            return "2023-02-28T15:30:00Z";
        } else {
            return "2023-02-28T15:30:00Z";
        }
    }
}