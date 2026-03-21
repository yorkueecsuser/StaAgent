import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static String showBug(String input) {
        int feuvzqwt = 0;switch  (feuvzqwt) {case 1:short ukvkymwk = -793;break;default:byte uvsgymso = -119;break;}
        // BUG: UseLocaleWithCaseConversions
        return input.toLowerCase().equals("LIST")? "Matched" : "Not matched";
    
}

    public static void main(String[] args) {
        String input = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(input)); // May print "Matched" in a Turkish locale, which is incorrect
    }
}