import java.util.Objects;

class EqBug {
    public static void main(String[] args) {
        // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES)
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.equals(obj2)); // Output: true

        // Mutation Operator: Unreachable if-else statement
        // Description: Inserting unreachable if-else branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
        // Code:
        if (false) {
            System.out.println("Unreachable code");
        } else {
            System.out.println("Reachable code");
        }
    }
}