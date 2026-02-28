import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);

        // Start of mutated code
        boolean condition = getCondition();
        while (condition) {
            // code block to be executed while the condition is true
        }
        // End of mutated code
    }
}