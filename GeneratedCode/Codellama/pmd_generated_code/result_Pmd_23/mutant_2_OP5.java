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

    // Unreachable switch statement mutant
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // BUG: ClassCastExceptionWithToArray
        Integer[] array = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(array));

        // Unreachable switch statement
        switch (0) {
            case 0:
                System.out.println("Unreachable code");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }
}