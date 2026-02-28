import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);
    }
}

class RegExBugMutant {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        Pattern pattern = Pattern.compile("([a-z]"); // Mutated: Renamed variable "pattern" to "patternMutant"
        boolean matches = patternMutant.matcher(str).matches();
        System.out.println(matches);
    }
}