import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    private static boolean getFalseCondition() {
        return false;
    }

    public static String showBug(String input) {
        // BUG: UseLocaleWithCaseConversions
        if (getFalseCondition()) {
            int value = input.length();
            switch (value) {
                case 1:
                    // Unreachable code
                    return "Unreachable";
                default:
                    break;
            }
        }
        return input.toLowerCase().equals("LIST")? "Matched" : "Not matched";
    }

    public static void main(String[] args) {
        String input = "lıst";
        System.out.println(showBug(input));
    }
}