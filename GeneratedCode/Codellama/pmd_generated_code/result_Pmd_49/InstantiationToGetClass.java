import java.util.Arrays;

class InstantiationToGetClass {
    public static void main(String[] args) {
        // BUG: InstantiationToGetClass
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());
        while (true) {
            // Unreachable while loop added
            if (false) {
                break;
            }
            // Rest of the code
        }
    }

    public static void showBug() {
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());
        while (true) {
            // Unreachable while loop added
            if (false) {
                break;
            }
            // Rest of the code
        }
    }
}