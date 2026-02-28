import java.util.Locale;

class CaseConversionBug {
    public static void main(String[] args) {
        String str = "İ";
        System.out.println(str.toLowerCase());

        // Start of mutated code
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code is unreachable");
        }
        // End of mutated code
    }

    private static boolean getCondition() {
        return false;
    }
}