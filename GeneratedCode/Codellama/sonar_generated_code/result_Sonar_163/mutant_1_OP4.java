import java.util.ArrayList;

class StringBuilderBug {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        sb.append(" is the first letter of the alphabet");
        System.out.println(sb.toString());

        // Mutation Operator: Unreachable if-else statement
        // Description: Inserting unreachable if-else branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // unreachable code
        } else {
            // unreachable code
        }
    }
}