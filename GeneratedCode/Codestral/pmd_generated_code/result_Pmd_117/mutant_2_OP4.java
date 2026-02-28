import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        // Adding unreachable if-else statement
        boolean shouldRun = false;
        if (shouldRun) {
            // Unreachable code
            System.out.println("This code will never run.");
        } else {
            // Original code
            Collection<String> c = new Vector<>();
            c.add("Bug");
            return (ArrayList<String>) c; // This will throw a ClassCastException at runtime
        }
    }

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug();
        System.out.println(result);
    }
}