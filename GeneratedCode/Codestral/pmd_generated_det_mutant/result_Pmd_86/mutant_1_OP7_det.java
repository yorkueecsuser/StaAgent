import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static String showBug(String input) {
        boolean kbrmkflq = false;while (kbrmkflq && false && false && true && false && true && true && false && false && false && false && false) {long fybvuvxp = -648771904;}
        // BUG: UseLocaleWithCaseConversions
        return input.toLowerCase().equals("LIST")? "Matched" : "Not matched";
    
}

    public static void main(String[] args) {
        String input = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(input)); // May print "Matched" in a Turkish locale, which is incorrect
    }
}