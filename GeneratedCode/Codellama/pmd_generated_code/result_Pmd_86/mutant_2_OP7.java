import java.util.Locale;

class CaseConversionBug {
    public static void main(String[] args) {
        String str = "İ";
        System.out.println(str.toLowerCase());
        
        // Unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never be executed
            System.out.println("This is an unreachable statement");
        }
    }
}