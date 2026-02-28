import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);
    }
}

// Renaming user-defined variables declared in a program
String str = "This is a string with a [ in it";
String pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
boolean matches = pattern.matcher(str).matches();
System.out.println(matches);