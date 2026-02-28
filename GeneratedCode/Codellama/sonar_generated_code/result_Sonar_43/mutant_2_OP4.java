import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);

        // Unreachable if-else statement mutation
        boolean condition = getCondition();
        if (condition) {
            // do nothing
        } else {
            // do nothing
        }
    }

    private static boolean getCondition() {
        return false;
    }
}