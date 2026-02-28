import java.util.ArrayList;
import java.util.List;

class Example {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // BUG: HSM: Method hiding should be avoided. (HSM_HIDING_METHOD)
        System.out.println(numbers.get(2));
    }
}

// Renaming: Replace the variable name "numbers" with a new name in the format of [a-z].
class Example {
    public static void main(String[] args) {
        List<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.add(5);

        // BUG: HSM: Method hiding should be avoided. (HSM_HIDING_METHOD)
        System.out.println(n.get(2));
    }
}