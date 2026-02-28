import java.util.Date;

class BuggyCode {
    public static void main(String[] args) {
        String dateString = getHeaderField("date");
        dateString.trim();
        System.out.println(dateString);
    }

    /* ================ Unreachable if-else statement ================ */
    public static String getHeaderField(String name) {
        boolean condition = getCondition();
        if (condition) {
            return "2023-02-28T15:30:00Z";
        } else {
            return "2023-02-28T15:30:00Z";
        }
    }
}