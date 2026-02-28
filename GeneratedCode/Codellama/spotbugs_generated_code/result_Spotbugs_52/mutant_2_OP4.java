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

/* Mutant 1: Unreachable if-else statement */
class BuggyCode1 {
    public static void main(String[] args) {
        String dateString = getHeaderField("date");
        dateString.trim();
        System.out.println(dateString);
    }

    public static String getHeaderField(String name) {
        // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
        if (false) {
            return "2023-02-28T15:30:00Z";
        } else {
            return "2023-02-28T15:30:00Z";
        }
    }
}

/* Mutant 2: Unreachable if-else statement */
class BuggyCode2 {
    public static void main(String[] args) {
        String dateString = getHeaderField("date");
        dateString.trim();
        System.out.println(dateString);
    }

    public static String getHeaderField(String name) {
        // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
        if (getCondition()) {
            return "2023-02-28T15:30:00Z";
        } else {
            return "2023-02-28T15:30:00Z";
        }
    }

    private static boolean getCondition() {
        return false;
    }
}