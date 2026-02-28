import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        Collection<String> c = new Vector<>();
        c.add("Bug");

        // Mutation: Unreachable switch statement
        boolean shouldRun = false;
        int value = 0;
        switch(value) {
            case 1:
                shouldRun = true;
                break;
        }

        if (shouldRun) {
            System.out.println("This statement should never be printed.");
        }

        return (ArrayList<String>) c; // This will throw a ClassCastException at runtime
    }

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug();
        System.out.println(result);
    }
}