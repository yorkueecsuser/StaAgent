import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionExample {

    public Integer[] showBug() {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);

        // BUG: ClassCastExceptionWithToArray
        Integer[] array = (Integer[]) collection.toArray(); // This line will cause ClassCastException

        // Mutant code with renaming
        Collection<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        Integer[] c = (Integer[]) b.toArray();

        return array;
    }

    public static void main(String[] args) {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        try {
            example.showBug();
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}