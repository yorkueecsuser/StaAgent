import java.util.Arrays;

class InstantiationToGetClass {
    public static void main(String[] args) {
        // BUG: InstantiationToGetClass
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());
    }

    public static void showBug() {
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());
    }
}

// Unreachable switch statement mutant
class InstantiationToGetClass {
    public static void main(String[] args) {
        // BUG: InstantiationToGetClass
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());

        // Unreachable switch statement
        switch (false) {
            case true:
                System.out.println("This branch is unreachable");
                break;
            default:
                System.out.println("This default branch is also unreachable");
                break;
        }
    }

    public static void showBug() {
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());

        // Unreachable switch statement
        switch (false) {
            case true:
                System.out.println("This branch is unreachable");
                break;
            default:
                System.out.println("This default branch is also unreachable");
                break;
        }
    }
}