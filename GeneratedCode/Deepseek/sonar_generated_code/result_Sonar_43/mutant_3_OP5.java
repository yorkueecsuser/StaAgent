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

        // Mutation Operator: Unreachable switch statement
        // A switch statement with a condition that will never be true.
        boolean alwaysFalse = false;
        switch (alwaysFalse) {
            case true:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }
        return str;
    }
}