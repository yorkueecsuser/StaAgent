import java.util.Arrays;

class InstantiationToGetClass {
    public static void main(String[] args) {
        // BUG: InstantiationToGetClass
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());

        // Unreachable if statement
        if (false) {
            System.out.println("This statement is unreachable");
        }
    }

    public static void showBug() {
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());

        // Unreachable if statement
        if (false) {
            System.out.println("This statement is unreachable");
        }
    }
}