import java.util.*;

class SimpleExample {
    private boolean getFalseCondition() {
        return false;
    }

    public ArrayList<String> showBug() {
        Collection<String> c = new Vector<>();
        c.add("Bug");

        // Mutant code - Unreachable if statement
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            // This block of code is unreachable
            System.out.println("This is an unreachable block of code.");
        }

        return (ArrayList<String>) c; // This will throw a ClassCastException at runtime
    }

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug();
        System.out.println(result);
    }
}