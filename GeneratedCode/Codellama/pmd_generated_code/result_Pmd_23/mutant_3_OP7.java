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

// Unreachable while loop
while (false) {
    System.out.println("This loop is unreachable");
}

// If-else statement with unreachable code
if (false) {
    System.out.println("This code is unreachable");
} else {
    System.out.println("This code is reachable");
}

// Switch statement with unreachable case
switch (0) {
    case 1:
        System.out.println("This case is unreachable");
        break;
    default:
        System.out.println("This case is reachable");
        break;
}