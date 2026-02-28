import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegex {
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("söme pättern", Pattern.CASE_INSENSITIVE);

        // MUTANT CODE: Unreachable if statement
        boolean isUnreachable = falseMethod();
        if (isUnreachable) {
            System.out.println("This code segment is unreachable");
        }

        return pattern.matcher(input).matches();
    }

    // Dummy method that always returns false to make the if statement unreachable
    private boolean falseMethod() {
        return false;
    }
}