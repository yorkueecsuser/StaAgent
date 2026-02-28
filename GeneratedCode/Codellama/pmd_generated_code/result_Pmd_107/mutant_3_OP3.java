import java.util.ArrayList;

class ConsecutiveLiteralAppends {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb.toString());

        // Mutation Operator: Unreachable if statement
        // Insert an unreachable if branch into a randomly selected basic block in the program.
        // The condition of the inserted branch is always false to make it unreachable.
        if (false) {
            System.out.println("This statement is unreachable.");
        }
    }
}