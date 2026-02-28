import java.util.Locale;

class CaseConversionBug {
    public static void main(String[] args) {
        String str = "İ";
        boolean condition = getCondition();
        if (condition) {
            System.out.println(str.toLowerCase());
        } else {
            System.out.println("Reachable");
        }
    }
}