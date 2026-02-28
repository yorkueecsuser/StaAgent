import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);
        
        // Unreachable switch statement
        boolean condition = getCondition();
        switch(condition) {
            case true:
                // do something
                break;
            case false:
                // do something else
                break;
        }
    }
}