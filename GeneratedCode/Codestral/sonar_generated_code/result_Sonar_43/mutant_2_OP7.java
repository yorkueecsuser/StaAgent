import java.util.regex.Pattern;

class RegularExpressionBug {
    public static String showBug(String input) {
        String result = input.replaceAll("\\(\\[(", "{");

        // Mutated code: Inserting an unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            System.out.println("This line should never be executed");
        }

        return result;
    }

    // Method to return an unreachable condition
    public static boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(showBug("([Hello"));
    }
}