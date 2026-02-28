import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);

        // Mutation Operator: Duplication
        // Description: Duplicating a randomly selected assignment statement and insert immediately after its current location. To avoid side effect, the applicable assignment statement is limited to the ones without using method invocation
        // Core Requirements:
        // 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
        // 2. Generated mutated Java code MUST compile successfully.
        // 3. Mutant code being added MUST be unique not generic.
        // 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
        // 5. Generated mutated Java code MUST avoid unreachable statement error.

        Pattern pattern1 = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches1 = pattern1.matcher(str).matches();
        System.out.println(matches1);
    }
}