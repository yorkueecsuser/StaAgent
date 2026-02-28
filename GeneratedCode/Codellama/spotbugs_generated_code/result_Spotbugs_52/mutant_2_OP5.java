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

    // Unreachable switch statement mutation
    public static void unreachableSwitchStatement() {
        int value = getValue();
        switch(value) {
            case 0:
                // Unreachable code
                System.out.println("This code is unreachable");
                break;
            case 1:
                // Reachable code
                System.out.println("This code is reachable");
                break;
            default:
                // Default case
                System.out.println("This is the default case");
                break;
        }
    }

    // Method to get a value that is determined at runtime
    public static int getValue() {
        int value = 1;
        if (getCondition()) {
            value = 0;
        }
        return value;
    }

    // Method to get a condition that is determined at runtime
    public static boolean getCondition() {
        return Math.random() < 0.5;
    }
}