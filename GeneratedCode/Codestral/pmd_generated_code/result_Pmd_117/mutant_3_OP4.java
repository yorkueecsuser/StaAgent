import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        // BUG: UseArrayListInsteadOfVector
        Collection<String> c = new Vector<>();
        c.add("Bug");

        // Mutation: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code is unreachable
            System.out.println("This line should never execute.");
        } else {
            // This is the reachable part of the if-else statement
            return (ArrayList<String>) c; // This will throw a ClassCastException at runtime
        }
    }

    public static boolean getUnreachableCondition() {
        // This method always returns false to make the condition unreachable
        return false;
    }

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug();
        System.out.println(result);
    }
}