import java.util.Arrays;

class InstantiationToGetClass {
    public static void main(String[] args) {
        // BUG: InstantiationToGetClass
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());

        // Mutant 1: Unreachable for loop
        for (int i = 0; false; i++) {
            // This code is unreachable and will never be executed
            System.out.println("This is a mutant code");
        }
    }

    public static void showBug() {
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());

        // Mutant 2: Unreachable for loop
        for (int i = 0; false; i++) {
            // This code is unreachable and will never be executed
            System.out.println("This is a mutant code");
        }
    }
}