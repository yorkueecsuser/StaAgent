import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        obj.showBug();
    }

    public String showBug() {
        String str = "([";
        Pattern pattern = Pattern.compile("\\(\\["); // BUG: Regular expressions should be syntactically valid
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.find());
        boolean bugPresent = true;
        if (bugPresent) {
            // Do nothing
        } else {
            System.out.println("No bug present");
        }
        return str;
    }
}