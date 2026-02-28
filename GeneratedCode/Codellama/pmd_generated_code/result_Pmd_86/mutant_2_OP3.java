import java.util.Locale;

class CaseConversionBug {
    public static void main(String[] args) {
        String str = "İ";
        System.out.println(str.toLowerCase());

        // Mutant 1: Unreachable if statement
        if (getCondition()) {
            System.out.println("Unreachable code");
        }
    }

    // Helper method to get a condition that is always false
    private static boolean getCondition() {
        return false;
    }
}