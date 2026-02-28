import java.util.Date;

class BuggyCode {
    public static void main(String[] args) {
        String dateString = getHeaderField("date");
        dateString.trim();
        System.out.println(dateString);
    }

    public static String getHeaderField(String name) {
        // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
        // Mutation Operator: Unreachable while loop
        while (false) {
            // Inserted unreachable while loop
            System.out.println("This loop is unreachable!");
        }
        return "2023-02-28T15:30:00Z";
    }
}