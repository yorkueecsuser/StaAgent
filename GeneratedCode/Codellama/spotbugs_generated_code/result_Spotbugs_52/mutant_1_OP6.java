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

class UnreachableForLoopMutant {
    public static void main(String[] args) {
        String dateString = getHeaderField("date");
        dateString.trim();
        System.out.println(dateString);
        // Mutant Code
        boolean condition = false;
        for (int i = 0; condition; i++) {
            System.out.println("Unreachable for loop");
        }
    }

    public static String getHeaderField(String name) {
        // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
        return "2023-02-28T15:30:00Z";
    }
}