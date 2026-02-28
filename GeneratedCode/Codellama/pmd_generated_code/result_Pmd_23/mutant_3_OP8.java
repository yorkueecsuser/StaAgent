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

class ClassCastExceptionWithToArrayRenamed {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");

        // BUG: ClassCastExceptionWithToArray
        Integer[] array1 = list1.toArray(new Integer[list1.size()]);
        System.out.println(Arrays.toString(array1));
    }

    public static Integer[] showBugRenamed() {
        List<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("World");

        return list2.toArray(new Integer[list2.size()]);
    }
}