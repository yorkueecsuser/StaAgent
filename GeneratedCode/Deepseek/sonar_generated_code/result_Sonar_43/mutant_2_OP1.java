import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        obj.showBug();
    }

    public String showBug() {
        String str = "([";
        // The below line is an example of a dead store. 
        // We are adding a dead store in the form of an unused string variable, which is syntactically correct.
        String deadStore = "abcdefgh"; 
        Pattern pattern = Pattern.compile("\\(\\["); // BUG: Regular expressions should be syntactically valid
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.find());
        return str;
    }
}