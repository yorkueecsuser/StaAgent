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
    }

    public static Integer[] showBug() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        return list.toArray(new Integer[list.size()]);
    }
}

// Dead Store operator
String abcdefgh = new String("Hello World");

// Mutant code being added
List<String> abcdefgh = new ArrayList<>();
abcdefgh.add("Hello");
abcdefgh.add("World");

// BUG: ClassCastExceptionWithToArray
Integer[] array = abcdefgh.toArray(new Integer[abcdefgh.size()]);
System.out.println(Arrays.toString(array));
}