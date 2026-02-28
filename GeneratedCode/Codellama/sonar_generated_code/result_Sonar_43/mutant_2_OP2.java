import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);
    }
}

// Mutated code section below

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        Pattern pattern2 = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        boolean matches2 = pattern2.matcher(str).matches();
        System.out.println(matches);
        System.out.println(matches2);
    }
}