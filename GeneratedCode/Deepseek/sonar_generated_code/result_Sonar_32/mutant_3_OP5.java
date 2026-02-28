import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BugExample {
    public static String showBug() {
        Pattern pattern = Pattern.compile("\\1(.)");
        Matcher matcher = pattern.matcher("abcdefg");
        matcher.find();
        return matcher.group(1);
    }

    public static void main(String[] args) {
        try {
            System.out.println(showBug());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught expected exception: " + e);
        }

        // Unreachable switch statement
        boolean condition = false;
        switch (condition? 1 : 0) {
            case 1:
                System.out.println("Unreachable case");
                break;
            case 2:
                System.out.println("Another unreachable case");
                break;
            default:
                break;
        }
    }
}