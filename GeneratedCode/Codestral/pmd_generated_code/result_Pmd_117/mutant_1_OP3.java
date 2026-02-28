import java.util.*;

class SimpleExample {
    private boolean getCondition() {
        // This method always returns false
        return false;
    }

    public ArrayList<String> showBug() {
        Collection<String> c = new Vector<>();
        c.add("Bug");

        // Insert unreachable if branch
        if (getCondition()) {
            // This block of code is unreachable
            System.out.println("This is an unreachable block of code");
        }

        return (ArrayList<String>) c; // This will throw a ClassCastException at runtime
    }

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug();
        System.out.println(result);
    }
}