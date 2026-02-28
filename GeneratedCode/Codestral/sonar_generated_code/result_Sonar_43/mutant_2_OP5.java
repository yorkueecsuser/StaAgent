import java.util.regex.Pattern;

class RegularExpressionBug {
    public static String showBug(String input) {
        String result = input.replaceAll("\\(\\[(", "{");
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // Code that will never get executed
                System.out.println("This statement is unreachable.");
                break;
        }
        return result;
    }

    public static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(showBug("([Hello")); // Would throw PatternSyntaxException
    }
}