import java.util.Locale;

class CaseConversionBug {
    public static void main(String[] args) {
        String str = "İ";
        System.out.println(str.toLowerCase());

        // Unreachable switch statement mutant
        switch (0) {
            case 1:
                System.out.println("Reachable code");
                break;
            default:
                System.out.println("Unreachable code");
                break;
        }
    }
}