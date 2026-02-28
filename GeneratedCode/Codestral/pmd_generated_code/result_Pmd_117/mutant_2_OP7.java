import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        Collection<String> c = new Vector<>();
        c.add("Bug");

        // Added unreachable while loop
        boolean shouldRun = getCondition();
        while (!shouldRun) {
            System.out.println("This code will never run");
        }

        return (ArrayList<String>) c; // This will throw a ClassCastException at runtime
    }

    public boolean getCondition() {
        // This method always returns false to make the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug();
        System.out.println(result);
    }
}