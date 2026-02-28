import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        Collection<String> c = new Vector<>();
        c.add("Bug");

        // Added unreachable if statement
        if (isFalse()) {
            // This code is unreachable
            System.out.println("This is an unreachable code block.");
        }

        return (ArrayList<String>) c; // This will throw a ClassCastException at runtime
    }

    // Method that always returns false
    private boolean isFalse() {
        return false;
    }

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug();
        System.out.println(result);
    }
}