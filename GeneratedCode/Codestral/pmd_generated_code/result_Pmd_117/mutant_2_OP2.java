import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        // BUG: UseArrayListInsteadOfVector
        Collection<String> c = new Vector<>();
        c.add("Bug");
        // Mutant: Duplicate the assignment statement
        Collection<String> d = c;
        return (ArrayList<String>) c; // This will throw a ClassCastException at runtime
    }

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug();
        System.out.println(result);
    }
}