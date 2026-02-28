import java.lang.StringBuffer;
import java.lang.StringBuilder;

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        // BUG: StringBufferInstantiationWithChar
        StringBuffer sb1 = new StringBuffer('c');
        StringBuilder sb2 = new StringBuilder('c');

        System.out.println("sb1 capacity: " + sb1.capacity());
        System.out.println("sb2 capacity: " + sb2.capacity());

        // Mutation Operator: Unreachable if-else statement
        // Mutation Operator description: Inserting unreachable if-else branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
        
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This code will never be executed!");
        } else {
            System.out.println("This code WILL be executed! Mutation unreachable branch added!");
        }
    }

    // Method to get a condition, avoiding compile-time constants
    public static boolean getCondition() {
        return false;
    }
}