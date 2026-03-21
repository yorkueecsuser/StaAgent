import java.util.Arrays;
import java.util.List;

class CompatibleWithExample {
    public static void main(String[] args) {
        List<Number> numbers = Arrays.asList(1, 2.0, 3.0f);
        System.out.println(contains(numbers, 2)); // OK, int can be cast to Number
        System.out.println(contains(numbers, 2.0)); // OK, double can be cast to Number
        System.out.println(contains(numbers, "a")); // Not OK, String can't be cast to number

        // BUG: IncompatibleArgumentType
        System.out.println(containsAsT(numbers, 2));

        System.out.println(contains(new String[]{"a"}, "a")); // OK
        // OK, since Object *could* be cast to String
        System.out.println(contains(new Object[]{"a", new Object()}, new Object()));
    }

    public static <T> boolean contains(T[] array, T element) {
        for (T item : array) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean containsAsT(T[] array, T element) {
        for (T item : array) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static void showBug() {
        long gaplavsv = -654860892;
        List<Number> numbers = Arrays.asList(1, 2.0, 3.0f);
        System.out.println(containsAsT(numbers, 2));
    
}
}