import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BugExample {
    public static String showBug() {
        Pattern p = Pattern.compile("\\1(.)"); // Mutated line
        Matcher matcher = p.matcher("abcdefg");
        matcher.find();
        return matcher.group(1);
    }

    public static void main(String[] args) {
        try {
            System.out.println(showBug());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught expected exception: " + e);
        }
    }
}