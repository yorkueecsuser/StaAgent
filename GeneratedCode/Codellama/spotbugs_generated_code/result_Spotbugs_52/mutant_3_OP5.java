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

// Unreachable switch statement mutant
class BuggyCodeMutant {
    public static void main(String[] args) {
        String dateString = getHeaderField("date");
        dateString.trim();
        System.out.println(dateString);

        // Unreachable switch statement mutant
        switch(false) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }
    }

    public static String getHeaderField(String name) {
        // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
        return "2023-02-28T15:30:00Z";
    }
}