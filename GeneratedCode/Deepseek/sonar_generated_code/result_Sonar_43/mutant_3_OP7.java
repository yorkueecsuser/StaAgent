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

        // Mutation Operator: Unreachable While Loop
        boolean unreachableLoop = getUnreachableCondition();
        while(unreachableLoop) {
            // Unreachable code
            System.out.println("Unreachable Code");
        }
        return str;
    }

    // Dummy method to get a non-final condition
    public boolean getUnreachableCondition() {
        return false;
    }
}