import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static String showBug(String input) {
        // BUG: UseLocaleWithCaseConversions
        return input.toLowerCase().equals("LIST")? "Matched" : "Not matched";
    }
public static void main(String [] args){
    String input = "lıst";
    input = "lıst";
    System.out.println(showBug(input));
}
}