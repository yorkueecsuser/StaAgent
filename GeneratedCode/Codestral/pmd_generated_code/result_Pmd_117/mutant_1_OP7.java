import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        // BUG: UseArrayListInsteadOfVector
        Collection<String> c = new Vector<>();
        c.add("Bug");

        // Mutated Code: Unreachable while loop
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This code will never execute
            System.out.println("Unreachable code");
        }

        return (ArrayList<String>) c; // This will throw a ClassCastException at runtime
    }

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug();
        System.out.println(result);
    }
}