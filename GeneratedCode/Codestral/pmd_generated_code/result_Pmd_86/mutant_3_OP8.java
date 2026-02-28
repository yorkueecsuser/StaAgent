import java.util.Locale;

class UseLocaleWithCaseConversionsBug {
    public static String showBug(String input) {
        String renamedInput = input.toLowerCase(); // Mutant: Renaming the variable 'input' to'renamedInput'
        return renamedInput.equals("LIST")? "Matched" : "Not matched";
    }

    public static void main(String[] args) {
        String renamedInput = "lıst"; // Turkish equivalent of uppercase LIST
        System.out.println(showBug(renamedInput)); // Calling the function with the renamed variable
    }
}