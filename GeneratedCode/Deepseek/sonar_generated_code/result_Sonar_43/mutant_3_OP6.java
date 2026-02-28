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

        // Mutation: Inserting an unreachable for loop into a randomly selected basic block
        boolean falseCondition = false;
        for (int i = 0; falseCondition; i++) {
            // Unreachable code
            System.out.println("Unreachable code");
        }

        return str;
    }
}