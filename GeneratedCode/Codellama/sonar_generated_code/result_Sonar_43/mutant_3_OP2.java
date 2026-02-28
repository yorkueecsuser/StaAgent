import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);
        // Mutation Operator: Duplication
        // Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
        // Generated mutated Java code MUST compile successfully.
        // Mutant code being added MUST be unique not generic.
        // Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
        // Generated mutated Java code MUST avoid unreachable statement error.
        Pattern pattern_dup = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches_dup = pattern_dup.matcher(str).matches();
        System.out.println(matches_dup);
    }
}