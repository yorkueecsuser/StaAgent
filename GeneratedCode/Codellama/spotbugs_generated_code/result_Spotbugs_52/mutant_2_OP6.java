import java.util.Date;

class BuggyCode {
    public static void main(String[] args) {
        String dateString = getHeaderField("date");
        dateString.trim();
        System.out.println(dateString);
    }

    public static String getHeaderField(String name) {
        // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)

        // Inserted unreachable for loop
        for (int i = 0; false; i++) {
            // This loop will never be executed, as the condition is always false
        }
        return "2023-02-28T15:30:00Z";
    }
}