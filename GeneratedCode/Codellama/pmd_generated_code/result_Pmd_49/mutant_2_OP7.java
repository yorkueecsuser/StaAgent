import java.util.Arrays;

class InstantiationToGetClass {
    public static void main(String[] args) {
        // BUG: InstantiationToGetClass
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());

        // Unreachable while loop mutant
        // The condition of the inserted loop is always false to make it unreachable
        while (false) {
            // code
        }
    }

    public static void showBug() {
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());

        // Unreachable while loop mutant
        // The condition of the inserted loop is always false to make it unreachable
        while (false) {
            // code
        }
    }
}