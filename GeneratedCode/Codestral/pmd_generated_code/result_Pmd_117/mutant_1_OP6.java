import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            for (int i = 0; false; i++) {
                // Unreachable for loop
            }
        }

        Collection<String> c = new Vector<>();
        c.add("Bug");
        return (ArrayList<String>) c; // This will throw a ClassCastException at runtime
    }

    private boolean getCondition() {
        // Implement the logic to return a boolean condition
        return false; // Placeholder, replace with actual logic
    }

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug();
        System.out.println(result);
    }
}