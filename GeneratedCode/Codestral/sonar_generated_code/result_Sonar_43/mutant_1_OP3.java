import java.util.regex.Pattern;

class RegularExpressionBug {
    public static String showBug(String input) {
        String result = input.replaceAll("\\(\\[(", "{");
        // Mutated code: Unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code will never be executed.");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(showBug("([Hello"));
    }
}