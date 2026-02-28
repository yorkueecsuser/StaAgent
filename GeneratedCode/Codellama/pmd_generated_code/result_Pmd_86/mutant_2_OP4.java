import java.util.Locale;

class CaseConversionBug {
    public static void main(String[] args) {
        String str = "İ";
        boolean condition = getCondition();
        if (condition) {
            System.out.println(str.toLowerCase());
        } else {
            System.out.println(str.toUpperCase());
        }
    }
}

// Unreachable if-else branch
public String getCondition() {
    return false;
}