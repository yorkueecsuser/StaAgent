import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        // BUG: UseArrayListInsteadOfVector
        Collection<String> c = new Vector<>();
        c.add("Bug");

        // Mutant code: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never execute.");
        }

        return (ArrayList<String>) c; // This will throw a ClassCastException at runtime
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug();
        System.out.println(result);
    }
}