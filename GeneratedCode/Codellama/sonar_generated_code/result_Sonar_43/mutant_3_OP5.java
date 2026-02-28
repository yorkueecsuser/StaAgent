import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid

        // Unreachable switch statement mutant
        int value = getValue();
        switch (value) {
        case 1:
            // Code that should never be executed
            // But it is inserted to make the switch statement unreachable
            System.out.println("Unreachable code");
            break;
        }

        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);
    }

    // Helper method to get a value for the switch statement
    private static int getValue() {
        return 0;
    }
}