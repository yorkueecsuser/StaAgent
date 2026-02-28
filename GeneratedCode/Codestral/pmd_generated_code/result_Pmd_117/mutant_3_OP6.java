import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        // BUG: UseArrayListInsteadOfVector
        Collection<String> c = new Vector<>();
        c.add("Bug");

        // Add unreachable for loop based on Mutation Operator Information
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // This code will never execute
            System.out.println("This is an unreachable for loop");
        }

        return (ArrayList<String>) c; // This will throw a ClassCastException at runtime
    }

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug();
        System.out.println(result);
    }
}