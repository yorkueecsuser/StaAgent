import java.util.Locale;

class CaseConversionBug {
    public static void main(String[] args) {
        String str = "İ";
        System.out.println(str.toLowerCase());

        // Unreachable switch statement mutant
        int value = getValue();
        switch (value) {
            case 1:
                // code
                break;
            default:
                // alternative code
                break;
        }
    }

    private static int getValue() {
        return 0;
    }
}