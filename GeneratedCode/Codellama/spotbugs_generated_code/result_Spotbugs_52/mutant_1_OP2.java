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

    // Mutant code: Duplication of assignment statement
    public static String getHeaderField(String name) {
        String dateString = getHeaderField("date");
        dateString = "2023-02-28T15:30:00Z";
        return dateString;
    }
}