import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);

        // Unreachable if statement mutation
        boolean condition = false;
        if (condition) {
            // This branch is unreachable
            System.out.println("This statement is unreachable");
        }
    }
}