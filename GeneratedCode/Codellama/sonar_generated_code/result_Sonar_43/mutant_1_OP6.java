import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);

        // Mutant code
        for (int i = 0; false; i++) {
            // unreachable code
            System.out.println("This code is unreachable");
        }
    }
}