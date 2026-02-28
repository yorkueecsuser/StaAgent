import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        // BUG: UseArrayListInsteadOfVector
        Collection<String> a = new Vector<>();
        a.add("Bug");
        return (ArrayList<String>) a; // This will throw a ClassCastException at runtime
    }

    public ArrayList<String> showMutant() {
        // Mutant: Renaming Mutation Operator
        Collection<String> b = new Vector<>();
        b.add("Mutant");
        return (ArrayList<String>) b; // This will throw a ClassCastException at runtime
    }

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug();
        System.out.println(result);
        ArrayList<String> mutantResult = example.showMutant();
        System.out.println(mutantResult);
    }
}