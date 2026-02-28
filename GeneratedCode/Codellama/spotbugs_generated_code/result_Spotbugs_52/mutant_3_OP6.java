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

/* Unreachable for loop mutant */
class UnreachableForLoop {
    public static void main(String[] args) {
        String dateString = getHeaderField("date");
        dateString.trim();
        for (int i = 0; false; i++) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
        System.out.println(dateString);
    }

    public static String getHeaderField(String name) {
        // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
        return "2023-02-28T15:30:00Z";
    }
}