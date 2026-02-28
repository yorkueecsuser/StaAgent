import java.util.Arrays;

class InstantiationToGetClass {
    public static void main(String[] args) {
        // BUG: InstantiationToGetClass
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());

        // Mutation Operator: Unreachable if-else statement
        // Description: Inserting unreachable if-else branch into a randomly
        // selected basic block in the program. The condition of the inserted
        // branch is always false to make it unreachable.
        boolean condition = getCondition();
        if (condition) {
            // code
        } else {
            // alternative code
        }
    }

    public static void showBug() {
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());

        // Mutation Operator: Unreachable if-else statement
        // Description: Inserting unreachable if-else branch into a randomly
        // selected basic block in the program. The condition of the inserted
        // branch is always false to make it unreachable.
        boolean condition = getCondition();
        if (condition) {
            // code
        } else {
            // alternative code
        }
    }

    // Method to provide a dynamically determined condition
    public static boolean getCondition() {
        return Math.random() < 0.5;
    }
}