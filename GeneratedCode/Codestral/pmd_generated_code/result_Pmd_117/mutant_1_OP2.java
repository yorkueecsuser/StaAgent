import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        Collection<String> c = new Vector<>();
        c.add("Bug");
        c.add("Bug");  // Mutant: Duplicated the assignment statement
        return (ArrayList<String>) c; // This will still throw a ClassCastException at runtime
    }

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug();
        System.out.println(result);
    }
}