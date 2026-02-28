import java.util.regex.Pattern;
import java.util.regex.Matcher;

class InvalidPatternSyntax {
    public static void main(String[] args) {
        String input = "abc";
        String regex = "*"; // BUG: InvalidPatternSyntax
        Matcher matcher = Pattern.compile(regex).matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

class UnreachableSwitchStatement {
    public static void main(String[] args) {
        String input = "abc";
        String regex = "*"; // BUG: InvalidPatternSyntax
        Matcher matcher = Pattern.compile(regex).matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        switch (getCase()) {
            case 1:
                // unreachable code
                System.out.println("case 1");
                break;
            case 2:
                // unreachable code
                System.out.println("case 2");
                break;
            default:
                // unreachable code
                System.out.println("default");
                break;
        }
    }
    static int getCase() {
        return 0;
    }
}