import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        Collection<String> c = new Vector<>();
        c.add("Bug");
        // Mutation: Renaming the variable 'c' to 'a'
        Collection<String> a = c;
        return (ArrayList<String>) a; // This will throw a ClassCastException at runtime
    }

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug();
        System.out.println(result);
    }
}