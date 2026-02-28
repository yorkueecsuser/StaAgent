import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        // BUG: UseArrayListInsteadOfVector
        Collection<String> c = new Vector<>();
        c.add("Bug");

        // Mutant code: Unreachable if-else statement
        boolean condition = false;
        if (condition) {
            return new ArrayList<>(); // This branch is unreachable
        } else {
            return (ArrayList<String>) c; // This will throw a ClassCastException at runtime
        }
    }

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug();
        System.out.println(result);
    }
}