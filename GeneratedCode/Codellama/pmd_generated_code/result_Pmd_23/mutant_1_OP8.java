import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ClassCastExceptionWithToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // BUG: ClassCastExceptionWithToArray
        Integer[] array = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(array));

        // Mutant 1: Renaming variable 'list' to 'l'
        List<String> l = new ArrayList<>();
        l.add("Hello");
        l.add("World");

        Integer[] a = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(a));
    }

    public static Integer[] showBug() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // Mutant 2: Renaming variable 'list' to 'l'
        List<String> l = new ArrayList<>();
        l.add("Hello");
        l.add("World");

        return list.toArray(new Integer[list.size()]);
    }
}